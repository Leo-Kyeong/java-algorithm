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

        int result = 0;
        int sum = 0; // lt ~ rt (부분수열합)
        int lt = 0;

        for(int rt = 0; rt < n; rt++){ // rt 0 ~ n까지
            sum += arr[rt]; // sum 에 arr[rt] 값 증가
            if(sum == m){ // sum 이 특정숫자(m)가 되었는지 확인
                result++;
            }
            while (sum >= m){ // sum 이 특정숫자(m)보다 크거나 같으면 반복
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
