public class MaxHeap {
    int[] heap; int size; int maxSize;                      // size <= maxSize
    MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.heap = new int[maxSize];
        this.size = 0;
    }
    // utility methods
    public int parent(int index) { return (index-1) / 2; }          // i/2
    public int left(int index) { return (2*index) + 1; }            // 2i
    public int right(int index) { return (2*index) + 2; }           // 2i+1
    public void swap(int fPos, int sPos) {
        int temp;
        temp = heap[fPos];
        heap[fPos] = heap[sPos];
        heap[sPos] = temp;
    }
    public boolean isLeaf(int pos) {
        if(pos > size/2 && pos <= size) return true;
        return false;
    }
    public void insert(int data) {
        int pos = size;
        heap[pos] = data;
        while(heap[pos] > heap[parent(pos)]) {
            swap(pos, parent(pos));
            pos = parent(pos);
        }
        ++size;
    }
    public void maxHeapify(int pos) {
        if(isLeaf(pos)) return;
        if(heap[pos] < heap[left(pos)] || heap[pos] < heap[right(pos)]) {
            if(heap[left(pos)] > heap[right(pos)]) {
                swap(pos, left(pos));
                maxHeapify(left(pos));
            } else {
                swap(pos, right(pos));
                maxHeapify(right(pos));
            }
        }
    }
    public int extractMax() {
        int del = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);
        return del;
    }
    public void display() {
        for(int i=0; i < size/2; i++) {
            System.out.print("Parent Element - " + heap[i] + " " );
            System.out.print("Left Child - " + heap[left(i)] + " " );
            System.out.print("Right Child - " + heap[right(i)] + " " );
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);             // size = 0; maxSize = 10; heap[10];
        heap.insert(1);                                // size = 1
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
        heap.display();
        // Parent Element - 6 | Left Child - 4 | Right Child - 5
        // Parent Element - 4 | Left Child - 1 | Right Child - 3
        // Parent Element - 5 | Left Child - 2 | Right Child - 0

        System.out.println("Deleted Value - " + heap.extractMax() );
        heap.display();
        // Parent Element - 5 | Left Child - 4 | Right Child - 2
        // Parent Element - 4 | Left Child - 1 | Right Child - 3
    }
}
