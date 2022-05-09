package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array0206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        boolean[] flag = new boolean[n + 1];

        for(int i = 1; i <= n; i++){
            String number = st.nextToken();
            int change = Integer.parseInt(new StringBuilder(number).reverse().toString());
            if(change == 1) flag[i] = true;
            for(int j = 2; j < change; j++){
                if(change % j == 0){
                    flag[i] = true;
                }
            }
            if(!flag[i]){
                sb.append(change).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
