package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String0108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase().replaceAll(" ", "");

        char[] chars = str.toCharArray();

        int lt = 0, rt = chars.length - 1;

        String result = "";

        while (lt < rt) {
            if (Character.isAlphabetic(chars[lt]) && Character.isAlphabetic(chars[rt])) {
                if (chars[lt] == chars[rt]) {
                    lt++;
                    rt--;
                } else {
                    result = "NO";
                    break;
                }
                result = "YES";
            }else {
                if (!Character.isAlphabetic(chars[lt])){
                    lt++;
                }
                if (!Character.isAlphabetic(chars[rt])){
                    rt--;
                }
            }
        }
        System.out.println(result);
    }
}

