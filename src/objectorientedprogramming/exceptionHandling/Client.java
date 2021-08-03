package objectorientedprogramming.exceptionHandling;

public class Client {
    public static void main(String[] args){
        Student s1 = new Student();
        //s1.setAge(-10);//termination point of the program and need to make the main method dangerous to handle this

        //we can use try catch block
        System.out.println("Hello");
        try {
            s1.setAge(-10);
            System.out.println("after statement");
        } catch(Exception e) {
            System.out.println("before statement");
        }
        System.out.println("bye");
        System.out.println(s1.getAge());
    }
}
