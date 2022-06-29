package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 대소문자 변환
 */
public class String0102 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringBuilder output = new StringBuilder();

        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){ // 소문자면 참, 대문자면 거짓
                output.append(Character.toUpperCase(ch));
            }else {
                output.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(output.toString());
    }
}
