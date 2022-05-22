package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue0507 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }

        int idx = k;
        while (queue.size() != 1){
            if(idx == 0){
                idx = k;
            }
            if(idx == 1){
                queue.poll();
            }else {
                Integer poll = queue.poll();
                queue.offer(poll);
            }
            idx --;
        }
        System.out.println(queue.poll());
    }
}
