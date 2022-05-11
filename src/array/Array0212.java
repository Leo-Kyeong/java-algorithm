package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array0212 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 반 학생 수
        int m = Integer.parseInt(st.nextToken()); // 수학 테스트 수

        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                for(int k = 0; k < m; k++){ // 0번 테스트부터 m 테스트 전까지
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){ // 0등부터 n등 전까지
                        if(arr[k][s] == i){pi = s;}
                        if(arr[k][s] == j){pj = s;}
                    }
                    if(pi < pj){cnt++;}
                }
                if(cnt == m){result++;}
            }
        }
        System.out.println(result);
    }
}
