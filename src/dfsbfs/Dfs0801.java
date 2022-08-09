package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 합이 같은 합집합
 */
public class Dfs0801 {

    private static String result = "NO"; // 결과
    private static int n, total = 0; // 원소 갯수, 원소의 총 합
    private static boolean flag = false; // flag 를 통해 복귀하는 재귀 함수들을 모두 리턴 (성능 최적화)

    private static void DFS(int level, int sum, int[] arr) {
        if(flag) return; // true 일 경우 복귀하는 재귀 함수는 모두 return
        if(sum > total / 2) return; // 총 합(total) 보다 부분 집합의 합(sum)이 더 커지면 더 탐색할 필요가 없으므로 return
        if (level == n) { // 현재 레벨과 원소의 개수(n)가 같다면 (하나의 부분 집합이 만들어질 때까지)
            if((total - sum) == sum){ // 두 부분 집합의 원소의 합이 같은지 확인
                result = "YES";
                flag = true;
            }
        } else {
            DFS(level+1, sum+arr[level], arr); // 원소 포함
            DFS(level+1, sum, arr); // 원소 미포함
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
