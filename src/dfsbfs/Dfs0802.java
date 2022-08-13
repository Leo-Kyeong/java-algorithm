package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dfs0802 {

    private static int result = Integer.MIN_VALUE; // 트럭에 태울 수 있는 바둑이들의 최대 무게
    private static int c, n; // 트럭에 태울 수 있는 최대 무게(c), 바둑이 수(n)

    public static void DFS(int level, int sum, int[] arr) {
        if(sum > c) return;
        if(level == n){
            result = Math.max(result, sum);
        }else {
            DFS(level+1, sum+arr[level], arr); // 원소 사용
            DFS(level+1, sum, arr); // 원소 미사용
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        DFS(0, 0, arr);
        System.out.println(result);
    }
}
