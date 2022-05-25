package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeastRecentlyUsed {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int size = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        StringTokenizer order = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(order.nextToken());
        }

        int[] cache = new int[size];

        for(int x : arr){ // x: 작업
            int pos = -1;
            for(int i = 0; i < size; i++){
                if(x == cache[i]){ // Hit
                    pos=i;
                }
            }
            if(pos == -1) { // Miss
                for(int i = size-1; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }else { // Hit
                for(int i = pos; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
        }
        for (int i : cache) {
            System.out.print(i + " ");
        }
    }
}
