package twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TwoPointers0301 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        while (st1.hasMoreTokens()){
            list.add(Integer.parseInt(st1.nextToken()));
        }

        while (st2.hasMoreTokens()){
            list.add(Integer.parseInt(st2.nextToken()));
        }

//        Collections.sort(list);
        list.sort(Comparator.naturalOrder());

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
