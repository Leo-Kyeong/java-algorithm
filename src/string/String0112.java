package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String0112 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++){
            String temp = s.substring(0, 7).replace('#', '1').replace('*','0');
            int num = Integer.parseInt(temp, 2); // 2진수를 10진수로 변환
            result.append((char) num); // 10진수를 아스키 코드로 변환 : char 형태로 바꿈
            s = s.substring(7);
        }
        System.out.println(result);
    }
}
