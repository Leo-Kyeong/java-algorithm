package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        // 이분 검색은 정렬이 되어 있어야 한다.
        Arrays.sort(arr);

        int lt = 0;
        int rt = n-1;

        int result = 0;

        while (lt <= rt) {
            int mid = (lt + rt)/2;
            if(arr[mid] == m){
                result = mid + 1;
                break;
            }
            if(arr[mid] > m){
                rt = mid - 1;
            }else {
                lt = mid + 1;
            }
        }
        System.out.println(result);
    }
}
