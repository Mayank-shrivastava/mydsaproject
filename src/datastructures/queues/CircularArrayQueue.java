package datastructures.queues;

public class CircularArrayQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int currSize;
    private int maxSize;
    public static final int DEFAULT_CAPACITY = 10;

    public CircularArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CircularArrayQueue(int capacity) {
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = capacity - 1;
        this.currSize = 0;
        this.maxSize = capacity;
    }

    public boolean isFull() {
        return this.currSize == this.maxSize;
    }

    public boolean isEmpty() {
        return this.currSize == 0;
    }

    public void enqueue(int data) {
        if(!isFull()) {
            rear = (rear + 1) % arr.length; //circular array ways
            arr[rear] = data;
            currSize++;
        }
    }

    public void dequeue() {
        if(!isEmpty()) {
            front = (front + 1) % arr.length;
            currSize--;
        }
    }

    public int getFront() {
        return arr[front];
    }

    public static void main(String[] args) {
        CircularArrayQueue queue = new CircularArrayQueue();
        for(int i = 0; i <= 6; i++) {
            queue.enqueue(i);
        }
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(8);
        while(!queue.isEmpty()) {
            System.out.println(queue.getFront());
            queue.dequeue();
        }
    }
}
