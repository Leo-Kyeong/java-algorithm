package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DoubleCheck_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();

        String result = "U";

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if(value > 1){
                result = "D";
                break;
            }
        }
        System.out.println(result);
    }
}
