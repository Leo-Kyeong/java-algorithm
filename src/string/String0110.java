package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String0110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String[] s = st.nextToken().split("");
        String t = st.nextToken();

        int[] result = new int[s.length];

        int p = 1000;

        for(int i = 0; i < s.length; i++){ // 왼쪽 t와의 거리 계산
            if(s[i].equals(t)){
                p = 0;
                result[i] = p;
            }else {
                p++;
                result[i] = p;
            }
        }

        p = 1000;

        for(int i = s.length - 1; i >= 0; i--){ // 오른쪽 t와의 거리 개산
            if(s[i].equals(t)){
                p = 0;
            }else {
                p++;
                if(result[i] > p){ // 더 가까운 t의 거리
                    result[i] = p;
                }
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
