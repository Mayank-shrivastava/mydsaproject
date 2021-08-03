package objectorientedprogramming.inheritance;

public class Client {
    public static void main(String[] args) {
        // p-> reference p -> instance
        System.out.println("---Case 1---");
        P obj1 = new P();
        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        obj1.fun();
        obj1.fun1();

        // p -> reference c -> instance
        System.out.println("---Case 2 ---");
        P obj2 = new C();
        //Point to remember :-
        //   ->When we are writing the code entire control is in the hands of compiler and compiler look towards LHS expression.
        //   ->When program is executing the entire control is in the hands of JVM and JVM look towards RHS expression.
        System.out.println(obj2.d);
        System.out.println(((P)obj2).d);
        System.out.println(obj2.d1);
        System.out.println(((C)obj2).d2);
        obj2.fun();
        obj2.fun1();
        ((C) obj2).fun2();

        // p->instance c->reference
        // not possible case
//        System.out.println("---Case 3---");
//        C obj3 = new P();
//        System.out.println(obj3.d);
//        System.out.println(obj3.d1);
//        System.out.println(obj3.d2);

        //c -> instance c -> reference
        System.out.println("---Case 4---");
        C obj4 = new C();
        System.out.println(obj4.d);
        System.out.println(((P)obj4).d);
        System.out.println(obj4.d1);
        System.out.println(obj4.d2);
        obj4.fun();
        obj4.fun1();
        obj4.fun2();
    }
}
