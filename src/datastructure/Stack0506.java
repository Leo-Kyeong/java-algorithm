package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack0506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();

        int result = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ')'){
                stack.pop();
                if(arr[i-1] == '('){
                    result += stack.size();
                }else {
                    result += 1;
                }
            }else {
                stack.push(arr[i]);
            }
        }
        System.out.println(result);
    }
}
