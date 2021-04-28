package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) throws Exception {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(30);
        list.addLast(50);
        list.addFirst(60);
        list.display();
        System.out.println(list.kthNodeFromTheEnd(2));
        list.display();

    }
}
