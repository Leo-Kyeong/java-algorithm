package twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoPointers0305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int m = n / 2 + 1;

        int[] arr = new int[m];

        for(int i = 0; i < m; i++){
            arr[i] = i+1;
        }

        int lt = 0;
        int sum = 0;
        int result = 0;

        for(int rt = 0; rt < m; rt++){
            sum += arr[rt];
            if(sum == n){
                result++;
            }
            while (sum >= n){
                sum -= arr[lt];
                lt++;
                if(sum == n){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
