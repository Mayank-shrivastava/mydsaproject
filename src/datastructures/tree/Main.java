package datastructures.tree;

public class Main {
    public static void main(String[] args) {
        //binary tree
        //BinaryTree bt = new BinaryTree();
        //bt.display2();

        //Binary Search tree
        int[] inputArray = {10,20,30,40,50,60,70};
        MyBinarySearchTree bst = new MyBinarySearchTree(inputArray);
        //bst.display();
        System.out.println(bst.find(100));
        System.out.println(bst.max());
    }
}

// 10 true 20 true 40 false false true 50 false false true 30 false true 60 false false