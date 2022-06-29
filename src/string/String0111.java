package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 문자열 압축
 */
public class String0111 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }
        list.add(' ');

        StringBuilder sb = new StringBuilder();

        int cnt = 1;

        for(int i = 0; i < list.size() - 1; i++){
            if(Objects.equals(list.get(i), list.get(i + 1))){
                cnt++;
            }else {
                if(cnt > 1){
                    sb.append(list.get(i)).append(cnt);
                    cnt = 1;
                }else {
                    sb.append(list.get(i));
                }
            }
        }
        System.out.println(sb.toString());
    }
}
