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

    public void display() {
       display(root);
    }

    private void display(Node node) {
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
        display(node.left);
        display(node.right);

    }

}
