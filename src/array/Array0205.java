package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소수 (에라토스테네스 체)
 */
public class Array0205 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = 0;

        int[] ch = new int[n + 1];

        for(int i = 2; i <= n; i++){ // 2 ~ 10
            if(ch[i] == 0){ // 2, 3, 5, 7
                result++;
                for(int j = i; j <=n; j=j+i){
                    // 2, 4, 6, 8, 10
                    // 3, 6, 9
                    // 5, 10
                    // 7
                    ch[j] = 1;
                }
            }
        }
        System.out.println(result);
    }
}
