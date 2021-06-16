package datastructures.tree;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
    private class Node {
        int data;
        ArrayList<Node> children;
        Node(int data) {
            this.data = data;
            children = new ArrayList<>();
        }
    }
    private Node root;
    private int size;

    GenericTree() {
        Scanner sc = new Scanner(System.in);
        root = takeInput(sc,null,0);
    }

    //to take the input of the generic tree
    private Node takeInput(Scanner sc, Node parent, int ithChild) {
        if(parent == null) {
            System.out.println("Enter the data for the root node");
        } else {
            System.out.println("Enter the data for the " + ithChild + "th child for the " + parent.data);
        }
        int nodeData = sc.nextInt();
        Node newNode = new Node(nodeData);
        size++;
        System.out.println("Enter the number of children for " + newNode.data);
        int noOfChildren = sc.nextInt();
        for (int i = 0; i < noOfChildren; i++) {
            Node child = takeInput(sc,newNode,i);
            newNode.children.add(child);
        }
        return newNode;
    }

    public void display1() {
        display1(root);
    }

    private void display1(Node node) {
        //node data
        String str = node.data + "=>";
        for (int i = 0; i < node.children.size(); i++) {
            //add children data of the current node
            str = str + node.children.get(i).data + ", ";
        }
        str = str + "END";
        //display the string of the current node
        System.out.println(str);
        //display for all the nodes
        for (int i = 0; i < node.children.size(); i++) {
            display1(node.children.get(i));
        }
    }
}
