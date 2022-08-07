package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 합이 같은 합집합
 */
public class Dfs0801 {

    private static String result = "NO";
    private static int n, total = 0;
    private static boolean flag = false;

    private static void DFS(int level, int sum, int[] arr) {
        if(flag) return;
        if(sum > total / 2) return;
        if (level == n) {
            if((total - sum) == sum){
                result = "YES";
                flag = true;
            }
        } else {
            DFS(level+1, sum+arr[level], arr);
            DFS(level+1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        DFS(0, 0, arr);
        System.out.println(result);
    }
}
