package recursive;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBfs0707 {

    public static void BFS (Node root) {
        StringBuilder sb = new StringBuilder();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root); // 시작 노드 저장
        int level = 0;
        while (!queue.isEmpty()) { // 비어있다면 종료
            int len = queue.size();
            sb.append(level).append(" : ");
            for (int i = 0; i < len; i++) { // 현재 Queue 에 들어있는 요소만큼 반복
                Node cur = queue.poll();
                sb.append(cur.data).append(" ");
                if(cur.lt != null) queue.offer(cur.lt);
                if(cur.rt != null) queue.offer(cur.rt);
            }
            level++;
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) {
        Node root = new Node(1); // root
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        BFS(root);
    }

    static class Node {
        int data;
        Node lt, rt; // Node 객체의 주소를 저장하는 변수

        public Node(int val) {
            this.data = val;
            this.lt = null;
            this.rt = null;
        }
    }
}