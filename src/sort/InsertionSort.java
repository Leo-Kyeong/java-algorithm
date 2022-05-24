package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertionSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j;  // 이중 for 문이 종료되고도 j를 사용할 수 있도록 선언
            for(j = i-1; j >= 0; j--){
                if(temp < arr[j]){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
