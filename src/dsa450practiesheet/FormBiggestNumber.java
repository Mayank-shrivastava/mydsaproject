package dsa450practiesheet;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//we can sort the array to get the most accurate position of the element by using custom comparator or by using lambda
public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            //convert array of number into the array of string
            String[] strArr = new String[n];
            for (int j = 0; j < n; j++) {
                strArr[j] = String.valueOf(arr[j]);
            }

            //sort using lambda expression
            //Arrays.sort(strArr, (a,b) -> (b + a).compareTo(a + b));

            Arrays.sort(strArr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return 0;
                }
            });

            //sorting using custom comparator
            Arrays.sort(strArr, new LargestNumber());
            if(strArr[0].equals("0")) {
                System.out.println("0");
            }
            for(String str : strArr) {
                System.out.print(str + "");
            }
        }
    }

    //custom comparator
    public static class LargestNumber implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String order1 = o1 + o2;
            String order2 = o2 + o1;
            return order2.compareTo(order1);
        }
    }
}