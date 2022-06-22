package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TreeBfs0708 {

    public static int BFS (int s, int e) {
        int level = 0; // 레벨
        int[] dis = {1, -1, 5}; // 현수가 이동할 수 있는 거리
        int[] ch = new int[10001]; // 확인된 거리
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        while (!queue.isEmpty()) { // 비어있다면 종료
            int len = queue.size();
            for(int i = 0; i < len; i++){
                int x = queue.poll();
                for(int j = 0; j < 3; j++){
                    int nx = x + dis[j];
                    if(nx == e) return level + 1; // 송아지를 찾았다면 종료, 자식 노드 이므로 +1
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int result = BFS(s, e);
        System.out.print(result);
    }
}