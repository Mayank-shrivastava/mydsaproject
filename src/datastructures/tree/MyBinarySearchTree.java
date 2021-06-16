package datastructures.tree;

public class MyBinarySearchTree {

    //Construct the BST - If you are given the inputs for the tree as inOrder traversal format
    private class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public MyBinarySearchTree(int[] arr) {
        root = construct(arr , 0, arr.length - 1 );
    }

    private Node construct(int[] arr, int lo, int hi) {
        if(lo > hi) {
            return null;
        }

        // Get the mid value
        int mid = (lo + hi) / 2;

        // create the new node
        Node newNode = new Node();
        newNode.data = arr[mid];

        // recursive calls to the left and right nodes of the root
        newNode.left = construct(arr, 0, mid - 1);
        newNode.right = construct(arr, mid + 1, hi);

        return newNode;
    }

    // Display method for BST
    public void display() {
        display(root);
    }

    private void display(Node node) {
        //base case
        if(node == null) {
            return;
        }
        //self work
        String str = "";
        if(node.left == null) {
            str += ".";
        } else {
            str += node.left.data;
        }

        str += "->" + node.data + "<-";

        if(node.right == null) {
            str += ".";
        } else {
            str += node.right.data;
        }

        System.out.println(str);

        // recursive calls
        display(node.left);
        display(node.right);
    }

    //find(item) in the BST
    public boolean find(int item) {
        return find(item,root);
    }

    private boolean find(int item, Node node) {
        //base case
        if(node == null) {
            return false;
        }

        if(item > node.data) {
            return find(item,node.right);
        } else if(item < node.data) {
            return find(item, node.left);
        } else {
            return true;
        }
    }

    //insert item in the BST
    public void insert(int item) {
        insert(item,root);
    }

    private void insert(int item, Node node) {
        if(item > node.data) {
            if(node.right == null) {
                Node nn = new Node();
                node.data = item;

                node.right = nn;
            } else {
                insert(item, node.right);
            }
        } else {
            if(node.left == null) {
                Node nn = new Node();
                node.data = item;

                node.left = nn;

            } else {
                insert(item, node.left);
            }
        }
    }

    //find max in the BST
    public int max() {
        return max(root);
    }

    private int max(Node node) {
        //base case
        if(node.right == null) {
            return node.data;
        }

        return max(node.right);
    }

    // removing the node from the BST


}
