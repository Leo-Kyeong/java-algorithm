package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array0211_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+1][6];
        int[] student = new int[n+1];

        int max = Integer.MIN_VALUE;
        int result = 0;

        StringTokenizer st = null;

        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 1; j <= 5; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= 5; k++){ // 1학년 ~ 5학년
                    if(arr[i][k] == arr[j][k]){
                        student[i]++;
                        break;
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++){
           if(student[i] > max){
               max = student[i];
               result = i;
           }
        }
        System.out.println(result);
    }
}
