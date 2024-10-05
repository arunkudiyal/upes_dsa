public class BinarySearchTree {
    Node root;
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    BinarySearchTree() { this.root = null; }
    public void insert(int data) { root = insertData(root, data); }
    public int height() { return getHeight(root); }
    public Node insertData(Node root, int data) {
        if(root == null) root = new Node(data);
        else if(data < root.data) root.left = insertData(root.left, data);
        else if(data > root.data) root.right = insertData(root.right, data);

        return root;
    }
    public int getHeight(Node root) {
        if(root == null) return 0;

        int lHeight = getHeight(root.left);
        int   = getHeight(root.right);
        return Math.max(lHeight, rHeight) + 1;
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();              // root = null;
        // bst.insertData(bst.root, 50);
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(10);
        bst.insert(90);
        bst.insert(100);
        bst.insert(120);

        System.out.println( bst.height() );              // 4
    }
}
