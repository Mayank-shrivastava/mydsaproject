package datastructures.stacks;

public class DynamicStack extends StackUsingArray{

    public DynamicStack() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public DynamicStack(int capacity) throws Exception {
        super(capacity); // calling the parent class constructor
    }

    public void push(int item) throws Exception {
        if(size() == getStack().length) {
            int[] arr = new int[2*getStack().length];
            for(int i=0; i<getStack().length; i++) {
                arr[i] = getStack()[i];
            }
            setStack(arr);
        }
        super.push(item);
    }
}
