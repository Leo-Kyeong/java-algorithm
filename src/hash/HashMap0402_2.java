package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMap0402_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        String result = "YES";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }

        for(char c : s2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        if(!map1.equals(map2)){
            result = "NO";
        }
        System.out.println(result);
    }
}
