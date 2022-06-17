package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subset0706 {

    public static int n; // 집합의 원소의 개수
    public static int[] ch; // 부분 집합으로 사용할 숫자를 체크하는 배열

    public static void recursive(int level) {
        if(level == n+1){
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 1) tmp.append(i).append(" "); // 배열 값이 1이면 부분 집합 사용
            }
            if(tmp.length() > 0) System.out.println(tmp); // 공집합 출력 X
        }else {
            ch[level] = 1;
            recursive(level+1);
            ch[level] = 0;
            recursive(level+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        ch = new int[n+1];

        int startLevel = 1;

        recursive(startLevel);
    }
}
