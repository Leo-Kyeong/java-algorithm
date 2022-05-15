package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashSlidingWindow0404 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] s = br.readLine().toCharArray();
        char[] t = br.readLine().toCharArray();

        Map<Character, Integer> mapT = new HashMap<>();
        Map<Character, Integer> mapS = new HashMap<>();

        int result = 0;

        for(int i = 0; i < t.length; i++){
            mapT.put(t[i], mapT.getOrDefault(t[i], 0)+1);
        }

        for(int i = 0; i < t.length; i++){
            mapS.put(s[i], mapS.getOrDefault(s[i], 0)+1);
        }

        if(mapS.equals(mapT)){
           result++;
        }

        for(int i = t.length; i < s.length; i++){
            mapS.put(s[i], mapS.getOrDefault(s[i], 0)+1);
            mapS.put(s[i-t.length], mapS.getOrDefault(s[i-t.length], 0)-1);

            if(mapS.get(s[i-t.length]) == 0){
                mapS.remove(s[i-t.length]);
            }

            if(mapS.equals(mapT)){
                result++;
            }
        }
        System.out.println(result);
    }
}
