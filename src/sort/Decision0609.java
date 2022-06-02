package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Decision0609 {

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

        int result = 0;
        // 곡의 길이 중 가장 큰 값, 의미 있는 값을 뽑아내기 위해 stream 사용
        int lt = Arrays.stream(arr).max().getAsInt();
        // 곡의 길이를 모두 합한 값
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt){
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                result = mid;
                rt = mid - 1;
            }else {
                lt = mid + 1;
            }
        }
        System.out.println(result);
    }

    /**
     * dvd 의 크기가 capacity 일 때 모든 곡을 넣기 위해 필요한 dvd 의 수
     */
    public static int count(int[] arr, int capacity){
        // 녹화에 사용한 dvd 수, 사용한 dvd 용량
        int cnt = 1, sum = 0;
        for(int x : arr){
            if(sum + x > capacity){ // 용량보다 커지면 다음 dvd 로 넘어감
                cnt ++;
                sum = x; // 새로운 dvd 값으로 초기화
            }else { // 용량이 아직 남아있다면 현재 dvd 에 더 넣어줌
                sum += x;
            }
        }
        return cnt;
    }
}
