package recursive;

public class TreeDFS0709 {

    public static int DFS(int level, Node root) {
        if(root.lt == null && root.rt == null) return level;
        else return Math.min(DFS(level+1, root.lt), DFS(level+1, root.rt));
    }

    public static void main(String[] args) {
        Node root = new Node(1); // root
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        int length = DFS(0, root);
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
