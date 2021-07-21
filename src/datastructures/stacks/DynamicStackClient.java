package datastructures.stacks;

public class DynamicStackClient {
    public static void main(String[] args) throws Exception {
        DynamicStack stackUsingArray = new DynamicStack(5);
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        stackUsingArray.push(40);
        stackUsingArray.push(50);
        stackUsingArray.push(60);
        stackUsingArray.display();
        System.out.println(stackUsingArray.size());
        System.out.println(stackUsingArray.pop());
        System.out.println(stackUsingArray.top());
    }
}
