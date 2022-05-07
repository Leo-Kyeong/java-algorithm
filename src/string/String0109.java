package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String0109 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        char[] chars = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < chars.length; i++){
            if(Character.isDigit(chars[i])){
                sb.append(String.valueOf(chars[i]));
            }
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
