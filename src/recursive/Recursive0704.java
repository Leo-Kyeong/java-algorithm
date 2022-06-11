package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive0704 {

    public static int cnt = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        arr[0] = 1;
        arr[1] = 1;

        recursive(n, arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void recursive(int n, int[] arr) {
        if(cnt == n){
            return;
        }
        arr[cnt] = arr[cnt-2] + arr[cnt-1];
        cnt++;
        recursive(n, arr);
    }
}
