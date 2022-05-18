package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack0504 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n]; // 0 ~ 100

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());

        int[] moves = new int[m]; // 1 ~ 1000

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < m; i++){
            moves[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        int count = 0;

        for(int i = 0; i < m; i++){
            int pos = moves[i];
            for(int j = 0; j < n; j++){
                if(board[j][pos - 1] != 0) {
                    int doll = board[j][pos - 1];
                    board[j][pos - 1] = 0; // 빈 칸
                    if(!stack.isEmpty() && stack.peek() == doll){
                        stack.pop();
                        count += 2;
                    }else {
                        stack.push(doll);
                    }
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
