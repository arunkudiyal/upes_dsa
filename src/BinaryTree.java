public class BinaryTree {
    Node root;
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    BinaryTree() { this.root = null; }
    public void insert(int data) { }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();              // this.root = null;
        // referencing
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
    }
}
