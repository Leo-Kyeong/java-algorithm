package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMap0402 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        String result = "YES";

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : s2.toCharArray()){
            if(!map.containsKey(c) || map.get(c)==0) {
                result = "NO";
            }
            map.put(c, map.getOrDefault(c, 0)-1);
        }
        System.out.println(result);
    }
}
