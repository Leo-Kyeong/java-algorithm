package twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TwoPointers0301_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st1.nextToken());
        }

        for(int i = 0; i < m; i++){
            b[i] = Integer.parseInt(st2.nextToken());
        }

        int p1 = 0, p2 = 0; // pointers

        while (p1 < n && p2 < m) {
            if(a[p1] < b[p2]){
                list.add(a[p1]);
                p1++;
            }else {
                list.add(b[p2]);
                p2++;
            }
        }

        while (p1 < n) {
            list.add(a[p1]);
            p1++;
        }

        while (p2 < m) {
            list.add(b[p2]);
            p2++;
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
