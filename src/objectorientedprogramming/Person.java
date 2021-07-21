package objectorientedprogramming;

public class Person {
    private String name;
    private int age;

    //constructor-default
    public Person() {
        System.out.println("I am the default constructor");
    }
    //constructor-parameterized
    public Person(int age){
        this.age = age;
    }



    //getter
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    //getter
    public int getAge() {
        return age;
    }
    //setter
    public void setAge(int age) {
        this.age = age;
    }
}

