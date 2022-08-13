package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dfs0803 {

    private static int n, m = 0;
    private static int result = Integer.MIN_VALUE;

    public static void DFS(int level, int sum, int time, int[] ps, int[] pt) {
        if(time > m) return;
        if(level == n){
            result = Math.max(result, sum);
        }else {
            DFS(level+1, sum+ps[level], time+pt[level], ps, pt); // 포함
            DFS(level+1, sum, time, ps, pt); // 미포함
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken()); // 문재의 개수
        m = Integer.parseInt(st.nextToken()); // 제한 시간

        int[] ps = new int[n]; // 문제를 풀었을 때의 점수
        int[] pt = new int[n]; // 푸는데 걸리는 시간

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            ps[i] = Integer.parseInt(st.nextToken());
            pt[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0, 0, ps, pt);
        System.out.println(result);
    }
}
