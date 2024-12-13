import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
    public void delete(int key) { root = deleteKey(root, key); }
    public void inOrder() { inOrderTraversal(root); System.out.println(); }
    public void BFS() { bfs(root); }
    public Node insertData(Node root, int data) {
        if(root == null) root = new Node(data);
        else if(data < root.data) root.left = insertData(root.left, data);
        else if(data > root.data) root.right = insertData(root.right, data);

        return root;
    }
    public Node deleteKey(Node root, int key) {
        if(root == null) return null;
        else {
            // search the key in the BST
            if(key < root.data) root.left = deleteKey(root.left, key);
            else if(key > root.data) root.right = deleteKey(root.right, key);
            else {
                // I found the data - key
                if(root.right == null) return root.left;
                else if(root.left == null) return root.right;
                else {
                    root.data = findMax(root.left);
                    // root.data = finMin(root.right);
                    root.left = deleteKey(root.left, root.data);
                    // root.right = deleteKey(root.right, root.data);
                }
            }
        }
        return root;
    }
    public int findMax(Node root) {
        Node temp = root; int max = root.data;
        while(temp.right != null) {
            temp = temp.right;
            max = temp.data;
        }
        return max;
    }
    public int getHeight(Node root) {
        if(root == null) return 0;
        int lHeight = getHeight(root.left);
        int rHeight = getHeight(root.right);
        return Math.max(lHeight, rHeight) + 1;
    }
    public void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    public void bfs(Node root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public void display(Node root) {
        if(root != null) {
            display(root.right);
            System.out.print(root.data + " ");
            display(root.left);
        }
    }
    // public boolean searchKey(Node root, int key) {  }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();              // root = null;
        // bst.insertData(bst.root, 50);
        /* bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(10);
        bst.insert(90);
        bst.insert(100);
        bst.insert(120);
        bst.insert(40);
        bst.insert(60);

        System.out.println( bst.height() );              // 4
        bst.inOrder();                                   // 10 20 30 40 50 60 90 100 120
        System.out.println("BFS");
        bst.BFS();
        //bst.display(bst.root);
        // bst.delete(50);
        // bst.inOrder();                                  // 10 20 30 40 60 90 100 120 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i < n; i++) {
	        int element = sc.nextInt();
	        bst.insert(element);
        }
        System.out.println(bst.height());
    }
}
