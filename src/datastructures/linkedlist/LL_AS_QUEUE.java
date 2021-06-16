package datastructures.linkedlist;

public class LL_AS_QUEUE {
    private MyLinkedList queue;

    public LL_AS_QUEUE() {
        queue = new MyLinkedList();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(int item) {
        queue.addLast(item);
    }

    public int dequeue() throws Exception {
        return queue.removeFirst();
    }

    public int front() throws Exception {
        return queue.getFirst();
    }

    public void display() {
        queue.display();
    }
 }
