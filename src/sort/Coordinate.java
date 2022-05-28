package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Coordinate {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Point> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list.add(new Point(x, y));
        }

        // Comparable Interface 를 통해서 Point 객체를 정렬
        // 직접 구현한 compareTo Method 가 있담뎐 해당 메소드를 기준으로 정렬
        Collections.sort(list);

        for (Point point : list) {
            System.out.println(point.getX() + " " + point.getY());
        }
    }

    static class Point implements Comparable<Point> {

        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x){
                return this.y - o.y;
            }else {
                return this.x - o.x;
            }
        }
    }
}
