package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 회문 문자열
 */
public class String0107 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();

        StringBuilder result = new StringBuilder();

        for(int i = str.length()-1; i >=0; i--){
            result.append(str.charAt(i));
        }

        if(str.equals(result.toString())){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
