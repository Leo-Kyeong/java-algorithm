package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array0208 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] number = new int[n];
        int[] rank = new int[n];

        for(int i =0; i < n; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =0; i < n; i++){
            rank[i]++;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(number[i] < number[j]){
                    rank[i]++;
                }
            }
        }

        for(int i : rank){
            System.out.print(i + " ");
        }
    }
}
