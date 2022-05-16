package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack0501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();

        String result = "YES";

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '(') {
                stack.push(chars[i]);
            }else if(chars[i] == ')') {
                if(stack.isEmpty()) {
                    result = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            result = "NO";
        }
        System.out.println(result);
    }
}
