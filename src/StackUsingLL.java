public class StackUsingLL {
    Node top;
    static class Node {
        int data;
        Node next;
    }
    public void push(int data) {
        Node newNode = new Node();
        if(newNode == null) System.out.println("Stack Overflow!");
        else {
            newNode.data = data;
            newNode.next = top;
            top = newNode;
        }
    }
    public void pop() {
        if(top == null) System.out.println("Stack Underflow!");
        else top = top.next;
    }
    public int peek() {
        if(top == null) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return top.data;
    }
    public void display() {
        Node temp = top;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    StackUsingLL() { this.top = null; }
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();                    // top = null;
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();                        // 30 20 10

        stack.pop();
        stack.display();                        // 20 10
    }
}
