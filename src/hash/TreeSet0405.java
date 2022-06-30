package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TreeSet0405 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer sequence = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(sequence.nextToken());
        }

        int result = -1;

        Set<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++ ){
                for(int l = j + 1; l < n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        // Tset.remove(143); 요소 삭제
        // Tset.size(); 원소의 개수(길이)

        int cnt = 0;
        for (Integer x : Tset) {
            // System.out.println(x);
            cnt++;
            if(cnt == k){ // k번째 요소 출력
                result = x;
            }
        }
        System.out.println(result);
    }
}
