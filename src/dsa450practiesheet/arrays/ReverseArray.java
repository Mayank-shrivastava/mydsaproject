package dsa450practiesheet.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //reverse-array
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length - 1;
        //iterative-approach
        while(start < end) {
            //swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        //for reversing the list type parameter using library functions
        List<Integer> list = new java.util.ArrayList<>(List.of(6, 7, 8, 9, 10));
        Collections.reverse(list);
        System.out.println(list); // 10, 9, 8, 7, 6
        System.out.println(Arrays.toString(arr)); // 5, 4, 3, 2, 1
        recursiveReverseArray(arr, 0 , 4);
        System.out.println(Arrays.toString(arr)); // 1, 2, 3, 4, 5
    }

    //recursive-approach
    public static void recursiveReverseArray(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        //swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        recursiveReverseArray(arr, start + 1, end - 1);
    }
}
