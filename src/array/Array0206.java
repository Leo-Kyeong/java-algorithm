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

        for(int i = 0; i < n; i++){
            String number = st.nextToken();
            int change = Integer.parseInt(new StringBuilder(number).reverse().toString());
            for(int j = 2; j < change; j++){
                if(change % j == 0){
                    break;
                }
            }
        }
    }
}
