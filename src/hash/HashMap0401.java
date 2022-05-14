package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMap0401 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String chairman = br.readLine();

        char[] chars = chairman.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        char result = 0;

        for (int i = 0; i < chars.length; i++){
            map.put(chars[i], map.getOrDefault(chars[i], 0)+1);
        }

        // System.out.println(map.containsKey('A')); A라는 키가 존재하는지? ture/false
        // System.out.println(map.size()); 맵의 크기
        // System.out.println(map.remove('A')); 키 삭제

        int max = Integer.MIN_VALUE;
        for (Character key : map.keySet()) {
            // System.out.println(key+" "+map.get(key));
            if(map.get(key) > max){
                max = map.get(key);
                result = key;
            }
        }
        System.out.println(result);
    }
}
