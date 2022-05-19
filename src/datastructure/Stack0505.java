package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack0505 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] postfix = br.readLine().toCharArray();

        Stack<Integer> stack = new Stack<>();

        int rt = 0;
        int lt = 0;
        int result = 0;

        for (int i = 0; i < postfix.length; i++) {
            if (Character.isDigit(postfix[i])) {
                stack.push(postfix[i] - 48);
            }else {
                rt = stack.pop();
                lt = stack.pop();
                if(postfix[i] == '+'){
                    stack.push(lt + rt);
                }else if(postfix[i] == '-'){
                    stack.push(lt - rt);
                }else if(postfix[i] == '*'){
                    stack.push(lt * rt);
                }else if(postfix[i] == '/'){
                    stack.push(lt / rt);
                }
            }
        }
        result = stack.get(0);
        System.out.println(result);
    }
}
