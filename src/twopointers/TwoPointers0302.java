package twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class TwoPointers0302 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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

        Arrays.sort(a);
        Arrays.sort(b);

        List<Integer> list = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m){
            if(a[p1] < b[p2]){
                p1++;
            }else if(a[p1] > b[p2]){
                p2++;
            }else {
                list.add(a[p1]);
                p1++;
                p2++;
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
