package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Queue0508 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] sequence = br.readLine().toCharArray();
        char[] lesson = br.readLine().toCharArray();

        Queue<Character> queue = new LinkedList<>();

        String result = "YES";

        for (char x : sequence) {
            queue.offer(x);
        }

        for (char x : lesson) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    result = "NO";
                }
            }
        }
        if (!queue.isEmpty()){
            result ="NO";
        }
        System.out.println(result);
    }
}
