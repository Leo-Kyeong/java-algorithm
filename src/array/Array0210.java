package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array0210 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+2][n+2];

        StringTokenizer st = null;

        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 1; j <= n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int idx = arr[i][j];
                if(idx > arr[i-1][j] && idx > arr[i+1][j] & idx > arr[i][j-1] && idx > arr[i][j+1]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
