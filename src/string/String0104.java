package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String0104 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i =0; i < n; i++){
            String s = br.readLine();
            StringBuilder str = new StringBuilder(s).reverse();
            System.out.println(str.toString());
        }
    }
}
