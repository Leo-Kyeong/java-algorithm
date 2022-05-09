package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array0207 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int result = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            int point = Integer.parseInt(st.nextToken());
            if(point == 1){
                sum++;
                result+=sum;
            }else {
                sum = 0;
            }
        }
        System.out.println(result);
    }
}
