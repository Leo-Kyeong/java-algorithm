package recursive;

public class Tree0705 {

    public static void DFS (Node root) {
        if(root == null) return;
        else {
            // System.out.print(root.data + " "); // 전위 순회
            DFS(root.lt);
            System.out.print(root.data + " "); // 중위 순회
            DFS(root.rt);
            // System.out.print(root.data + " "); // 후위 순회
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1); // root
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        DFS(root);
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
