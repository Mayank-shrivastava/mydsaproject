package datastructures.linkedlist;

import java.util.NoSuchElementException;

// 10 -> 20 -> 30 -> 40 -> |50|null|
public class MyLinkedList {

    Node head;
    Node tail;
    int size = 0;

    public void addFirst(int item) {
        //Step1 -> Create the new Node
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;

        // Step2 -> creating link and updating the summary object
        if (size == 0) {
            // update the summary object
            head = newNode;
            tail = newNode;
        } else {
            // creating the link
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        // Step1 -> create a new Node
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;

        // Step2 -> creating link and updating the summary object
        if (size == 0) {
            // update the summary object
            head = newNode;
        } else {
            // creating the link between previous node and the new node
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void addAt(int index, int item) throws Exception {
        if (index == 0) {
            addFirst(item);
        } else if (index == size - 1) {
            addLast(item);
        } else {
            //add node to the particular index
            //Step1 -> create a new node
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;
            //Step2 -> access the node previous to the given index
            Node previousNode = getNodeAt(index - 1);
            //Step3 -> access the node at the given index
            Node node = getNodeAt(index);
            //Step4 -> set the next of the previous node to the new node
            previousNode.next = newNode;
            newNode.next = node;
        }
    }

    public int removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException("Linked list is empty");
        }
        int removedData = head.data;
        //Point of special exception in case of remove
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
        return removedData;
    }

    public int removeLast() throws Exception {
        if (size == 0) {
            throw new NoSuchElementException("Linked List is empty");
        }
        int removedData = tail.data;
        //Point of special exception in case of remove
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            //Step1 -> access node previous to the tail
            Node previousNode = getNodeAt(size - 1);
            tail = previousNode;
            previousNode.next = null;
        }
        size--;
        return removedData;
    }

    public int removeAt(int index) throws Exception {
        if(size == 0) {
            throw new NoSuchElementException("Linked List is empty");
        }
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        int removedData = getNodeAt(index).data;
        if(index == 0) {
            removeFirst();
        } else if(index == size -1) {
            removeLast();
        } else {
            Node previousNode = getNodeAt(index - 1);
            Node node = getNodeAt(index + 1);
            //attach these two nodes
            previousNode.next = node;
            size--;
        }
        return removedData;
    }

    public int getFirst() {
        if (size == 0) {
            throw new NoSuchElementException("Linked list is empty");
        } else {
            return head.data;
        }
    }

    public int getLast() {
        if (size == 0) {
            throw new NoSuchElementException("Linked List is empty");
        } else {
            return tail.data;
        }
    }

    //reversing the linked list by using data
    public void reverseData() throws Exception {
        int leftPointer = 0;
        int rightPointer = size - 1;
        while(leftPointer < rightPointer) {
            Node leftNode = getNodeAt(leftPointer);
            Node rightNode = getNodeAt(rightPointer);
            int temp = leftNode.data;
            leftNode.data = rightNode.data;
            rightNode.data = temp;
            leftPointer++;
            rightPointer--;
        }
    }

    //reversing the linked list by using pointers
    public void reversePointer() {
        Node previousNode = head;
        Node currentNode = previousNode.next;
        while(currentNode != null) {
            Node ahead = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = ahead;
        }

        //Swapping
        Node t = head;
        head = tail;
        tail = t;

        tail.next = null;

    }

    //find the mid node of the linked list
    public int mid() {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    //find the kth node from the end of the linked list
    public int kthNodeFromTheEnd(int k) throws Exception {
        if(k < 0 || k > size) {
            throw new IndexOutOfBoundsException("Invalid k value");
        }
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=k; i++) {
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public int getAt(int index) throws Exception {
        if (index == 0) {
            return getFirst();
        } else if (index == size - 1) {
            return getLast();
        } else {
            return getNodeAt(index).data;
        }
    }

    private Node getNodeAt(int index) throws Exception{
        if (size == 0) {
            throw new NoSuchElementException("Linked list is empty");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        //System.out.println("-----------");
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null]");
        //System.out.println("------------");
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private class Node {
        int data;
        Node next;
    }
}

