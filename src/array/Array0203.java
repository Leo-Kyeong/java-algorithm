package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array0203 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer aToken = new StringTokenizer(br.readLine(), " ");
        StringTokenizer bToken = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(aToken.nextToken());
            int b = Integer.parseInt(bToken.nextToken());

            if((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)){
                sb.append("A").append("\n");
            }else if(a == b){
                sb.append("D").append("\n");
            }else {
                sb.append("B").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
