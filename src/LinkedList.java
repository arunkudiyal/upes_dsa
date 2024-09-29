public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    LinkedList() { this.head = null; }
    // A utility method to insert an element at the start of the LinkedList
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else {
            Node temp = head;
            // traverse & reach to the end of the LL
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }
    // A utility method to insert an element at the end of the LinkedList
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }
    // A utility method to insert an element in between of the LinkedList
    public void insertAfter(int data1, int data2) {
        if(head == null) System.out.println("LinkedList is Empty!");
        else {
            // search for data1
            Node temp = head;
            while(temp != null && temp.data != data1) temp = temp.next;
            if(temp == null) System.out.println(data1 + " is not in the LL");
            else {
                Node nextNode = temp.next;
                Node newNode = new Node(data2);
                temp.next = newNode;
                newNode.next = nextNode;
            }
        }
    }
    // A utility method to delete an element at the end of the LinkedList
    public void deleteFromEnd() {
        if(head == null) System.out.println("LinkedList is empty, call insertAtEnd() to insert!");
        else {
            Node temp = head;
            while(temp.next.next != null) temp = temp.next;
            temp.next = null;
        }
    }
    // A utility method to delete an element from the start of the LinkedList
    public void deleteFromStart() {
        if(head == null) System.out.println("LinkedList is empty, call insertAtEnd() to insert!");
        else head = head.next;
    }
    // A utility method to delete the element after the given data
    public void deleteElement(int data) {
        Node slow = head;
        Node temp = head;
        Node fast = head.next;
        while(temp.data != data) {
            slow = temp;
            temp = fast;
            fast = fast.next;
            if (temp == null) {
                System.out.println(data + " does not exist");
                break;
            }
        }
        slow.next = fast;
    }
    // A utility method to display the elements of the LinkedList from left to right
    public void display() {
        if(head == null) System.out.println("LinkedList is Empty!");
        else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();               // head = null;
        ll.display();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.display();                       // 10 20 30 40

        ll.insertAtStart(5);
        ll.display();                       // 5 10 20 30 40

        ll.insertAfter(100, 200);
        ll.display();                       // does not exist

        ll.insertAfter(30, 100);
        ll.display();                       // 5 10 20 30 100 40

        ll.insertAfter(40, 200);
        ll.display();
    }
}
