package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array0209 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] ints = new int[n][n];

        StringTokenizer st = null;

        for(int p = 0; p < n; p++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int q = 0; q < n; q++){
                ints[p][q] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        int sum1, sum2;

        for(int i = 0; i < n; i++){
            sum1 = sum2 = 0;
            for(int j = 0; j < n; j++){
                sum1 += ints[i][j];
                sum2 += ints[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        sum1 = sum2 = 0;

        for(int i = 0; i < n; i++){
            sum1 += ints[i][i];
            sum2 += ints[i][n-i-1];
        }
        max = Math.max(max, sum1);
        max = Math.max(max, sum2);

        System.out.println(max);
    }
}
