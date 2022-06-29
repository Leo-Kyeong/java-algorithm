package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 특정 문자 뒤집기
 */
public class String0105 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String output ;

        char[] chars = str.toCharArray();

        int lt = 0; // 첫번 째 문자
        int rt = str.length()-1; // 마지막 문자

        while (lt < rt){
             if(!Character.isAlphabetic(chars[lt])){ // 알파벳이 아닐 때(특수문자)
                lt++;
             }else if(!Character.isAlphabetic(chars[rt])){ // 알파벳이 아닐 때(특수문자)
                rt--;
             }else { // 알파벳일 때(뒤집기)
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
             }
        }
        output = String.valueOf(chars);
        System.out.println(output);
    }
}
