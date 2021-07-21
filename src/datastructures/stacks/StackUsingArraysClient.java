package datastructures.stacks;

public class StackUsingArraysClient {
    public static void main(String[] args) throws Exception{
//        StackUsingArray stackUsingArray = new StackUsingArray();
//        stackUsingArray.push(10);
//        stackUsingArray.push(20);
//        stackUsingArray.push(30);
//        stackUsingArray.push(40);
//        stackUsingArray.push(50);
//        stackUsingArray.display();
//        System.out.println(stackUsingArray.size());
//        System.out.println(stackUsingArray.pop());
//        System.out.println(stackUsingArray.top());
//        
        // reverse the stack using another helper stack
        StackUsingArray stack = new StackUsingArray(5);
        for(int i=1; i<=5; i++) {
            stack.push(i*10);
        }
        stack.display();
        StackUsingArray helper = new StackUsingArray(5);
        reverseStack(stack, helper,0);
        stack.display();
    }

    private static void reverseStack(StackUsingArray stack, StackUsingArray helper, int index) throws Exception{
        //base-case for recursion
        if(stack.isEmpty()) {
            return;
        }
        int item = stack.pop();
        reverseStack(stack, helper, index+1);
        helper.push(item);
        if(index == 0) {
            while(!helper.isEmpty()) {
                stack.push(helper.pop());
            }
        }
    }
}
