package datastructures.stacks;

public class StackUsingArray {
    private int[] stack;
    private int top;
    public static final int DEFAULT_CAPACITY = 10;

    public StackUsingArray() throws Exception{
        this(DEFAULT_CAPACITY);
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public StackUsingArray(int capacity) throws Exception{
        if(capacity < 1) {
            throw new Exception("Invalid Capacity");
        }
        this.stack = new int[capacity];
        this.top = -1;
    }

    public int size() {
        return this.top+1;
    }

    public boolean isEmpty() {
        return this.size()==0;
    }

    public void push(int data) throws Exception{
        if(size() == stack.length) {
            throw new Exception("Stack overflow");
        }
        stack[++top] = data;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack underflow");
        }
        return stack[top--];
    }

    public int top() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack underflow");
        }
        return stack[top];
    }

    public void display() {
        for(int i=top; i>=0; i--) {
            System.out.print(stack[i] + ",");
        }
        System.out.println();
    }



}
