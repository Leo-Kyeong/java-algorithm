package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String0101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().toLowerCase();
        String input2 = br.readLine().toLowerCase();

        int output = 0;

        String[] strings = input.split("");

        for(int i = 0; i < strings.length; i++){
            if(strings[i].equals(input2)){
                output++;
            }
        }
        System.out.println(output);
    }
}
