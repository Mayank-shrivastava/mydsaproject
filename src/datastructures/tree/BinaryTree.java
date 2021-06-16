package datastructures.tree;

import java.util.Scanner;

public class BinaryTree {
    Scanner scn = new Scanner(System.in);

    private class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public BinaryTree() {
        root = takeInput(null,false);
    }


    // Method for the construction of the binary tree
    private Node takeInput(Node parent, boolean isLeftChild) {
        if(parent == null) {
            System.out.println("Enter the data for the root:");
        } else {
            if(isLeftChild) {
                System.out.println("Enter the data for the left child of " + parent.data);
            } else {
                System.out.println("Enter the data for the right child of " + parent.data);
            }
        }
        int item = scn.nextInt();
        Node newNode = new Node();
        newNode.data = item;

        System.out.println( "Do "+ newNode.data + " have left child?");
        boolean hasLeftChild = scn.nextBoolean();

        if(hasLeftChild) {
             newNode.left = takeInput(newNode,true);
        }

        System.out.println("Do " + newNode.data + " have right child?");
        boolean hasRightChild = scn.nextBoolean();

        if(hasRightChild) {
            newNode.right = takeInput(newNode,false);
        }

        return newNode;
    }

    // Method to display the Binary tree
    public void display2() {
       display2(root);
    }

    private void display2(Node node) {
        if(node == null) {
            return;
        }
        String str = "";
        if(node.left == null)
            str += "." + "<-";
        else
            str += node.left.data + "<-";
        str += node.data;
        if(node.right == null)
            str += "<-" + ".";
        else
            str += "<-" + node.right.data;
        System.out.println(str);

        //recursive calls
        display2(node.left);
        display2(node.right);

    }

    // size of the binary tree => Number of nodes present in the binary tree
    public int size() {
        return size(root);
    }

    private int  size(Node node) {
        if(node == null) {
            return 0;
        }

        int ls = size(node.left);
        int rs = size(node.left);

        return ls + rs + 1;
    }
    // find(item)
    // max()
    // height of the binary tree
    // diameter of the binary tree - by different approaches
    // isBalanced
    // tree traversal -> inOrder, preOrder, postOrder
}
