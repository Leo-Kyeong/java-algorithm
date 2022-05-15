package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HashSlidingWindow0403 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer sequence = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
          arr[i] = Integer.parseInt(sequence.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < k; i++){ // 첫 번째 sliding window 초기화
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        sb.append(map.size()).append(" ");

        for(int i = k; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            map.put(arr[i-k], map.get(arr[i-k])-1);

            if(map.get(arr[i-k]) == 0) {
                map.remove(arr[i - k]);
            }
            sb.append(map.size()).append(" ");
        }
        System.out.println(sb.toString());
    }
}
