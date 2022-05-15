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

        Comparator<Integer> comparator = Comparator.reverseOrder();
        Map<Integer, Integer> map = new TreeMap<>(comparator);

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (Integer integer : map.keySet()) {
            System.out.println(integer+" "+map.get(integer));
        }
    }
}
