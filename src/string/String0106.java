package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 중복 문자 제거
 */
public class String0106 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
