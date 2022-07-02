package recursive;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBFS0710 {

    public static int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {
            int length = queue.size();
            for(int i = 0; i < length; i++) {
                Node cur = queue.poll();
                if(cur.lt == null && cur.rt == null) return level;
                if(cur.lt != null) queue.offer(cur.lt);
                if(cur.rt != null) queue.offer(cur.rt);
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Node root = new Node(1); // root
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        int length = BFS(root);
        System.out.println(length);
    }

    static class Node {
        int data;
        Node lt, rt; // 자식 Node

        public Node(int val) {
            this.data = val;
            this.lt = null;
            this.rt = null;
        }
    }
}
