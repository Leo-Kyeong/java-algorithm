package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Decision0610 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arr);

        int result = 0;
        int lt = 1;
        int rt = arr[n-1];

        while (lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) >= c){
                result = mid;
                lt = mid + 1;
            }else {
                rt = mid - 1;
            }
        }
        System.out.println(result);
    }

    private static int count(int[] arr, int distance) {
        int cnt = 1; // 배치한 말의 마릿수
        int ep = arr[0]; // endPosition
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - ep >= distance){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
