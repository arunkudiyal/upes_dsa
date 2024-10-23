import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(6);
        pq.add(5);
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(1);
        // Min-Heap
        System.out.println(pq.peek());                  // 2 (smallest)
        System.out.println(pq);
    }
}

/*
{0, 1, 0, 1, 0, 0, 0},
{1, 0, 1, 0, 0, 0, 0},
{0, 1, 0, 0, 0, 1, 0},
{1, 0, 0, 0, 1, 0, 0},
{0, 0, 0, 1, 0, 1, 0},
{0, 0, 1, 0, 1, 0, 1},
{0, 0, 0, 0, 0, 1, 0}
 */
