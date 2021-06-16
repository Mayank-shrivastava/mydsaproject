package functionaprogramming;

// method are the function which belongs to the class and the object
// functions have four things associated with it
//1.name
//2.return type
//3.parameter list
//4.body

// lambda expression
// (parameter list) -> body

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample {
    public static void main(String[] args) {
//        Thread th = new Thread(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        System.out.println("In another thread");
//                    }
//                }
//        );

        // removing all the ceremony around the previous code
        Thread th = new Thread(() -> { System.out.println("In another thread");});
        th.start();
        System.out.println("In main");

        //Looping through imperative and declarative style
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //imperative style
        // both are called as external iterators
        //approach-1 : for loop
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
        // approach-2 : enhanced for loo[
//        for(int e : numbers) {
//            System.out.println(e);
//        }

        //internal iterator
//        numbers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });

//        //by using lambdas expression
//        numbers.forEach((Integer e) -> System.out.println(e));
//
//        //by using method reference
//        numbers.forEach(System.out::println);



    }
}
