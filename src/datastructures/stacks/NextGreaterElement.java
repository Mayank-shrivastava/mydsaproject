package datastructures.stacks;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2,1,3,8,6,7,5};
        //complexity-> O(2n) -> Eliminating the constants -> O(n)
        Stack<Integer> stack = new Stack<>();
        for (int j : arr) {
            while (!stack.isEmpty() && j > stack.peek()) {
                int retrievedValue = stack.pop();
                System.out.println(retrievedValue + "->" + j);
            }
            stack.push(j);
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pop() + "->" + "-1");
        }
    }
}
