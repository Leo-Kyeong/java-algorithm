package twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SlidingWindow0303 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int result;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        result = sum;

        for(int i = k; i < n; i++){
            sum = sum + arr[i] - arr[i - k];
            if(result < sum){
                result = sum;
            }
        }
        System.out.println(result);
    }
}
