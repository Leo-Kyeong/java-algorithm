package twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math0306 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer sequence = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(sequence.nextToken());
        }

        int cnt = 0;
        int result = 0;
        int lt = 0;

        for(int rt = 0; rt < n; rt++){
            if(arr[rt] == 0){
                cnt++;
            }
            while (cnt > k){
                if(arr[lt] == 1){
                    lt++;
                }else if(arr[lt] == 0){
                    cnt--;
                    lt++;
                }
            }
            int length = rt - lt + 1;
            if(length > result){
                result = length;
            }

        }
        System.out.println(result);
    }
}
