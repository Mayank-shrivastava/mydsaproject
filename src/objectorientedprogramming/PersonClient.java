package objectorientedprogramming;

import java.util.LinkedList;

public class PersonClient {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Person P1 = new Person();
        System.out.println(P1.getAge());
        System.out.println(P1.getName());
        P1.setAge(10);
        P1.setName("A");
        System.out.println(P1.getAge());
        System.out.println(P1.getName());
        Person P2 = new Person(12);
        System.out.println(P2.getAge());
    }
}
