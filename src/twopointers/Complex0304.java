package twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Complex0304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // n개의 수
        int m = Integer.parseInt(st.nextToken()); // 수열에서 연속부분수열의 합인 특정숫자 M

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int result = 0; // 경우의 수
        int sum = 0; // arr[lt] ~ arr[rt] (부분수열합)
        int lt = 0; // 포인터 lt

        for(int rt = 0; rt < n; rt++){ // 포인터 rt를 0 ~ n까지 이동
            // 포인터 rt를 이동하면서 sum 의 값이 M의 값보다 같거나 클 때까지 증가 연산
            sum += arr[rt];
            if(sum == m){ // sum 이 특정숫자(m)가 되었는지 확인
                result++;
            }
            while (sum >= m){
                // sum 이 특정숫자(M)보다 같거나 크면
                // M의 값보다 작아질 때까지 포인터 lt를 이동 시켜 주며 해당 요소들을 감산
                sum -= arr[lt];
                lt++;
                if(sum == m){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
