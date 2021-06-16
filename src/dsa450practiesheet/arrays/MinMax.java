package dsa450practiesheet.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {10 , 45, 40, 46, 90};
        System.out.println(min(arr)); // 10
        System.out.println(max(arr)); // 90
        //By using collections
        List<Integer> list = List.of(12,33,56,68);
        System.out.println(Collections.min(list));//12
        System.out.println(Collections.max(list));//68
        //Arrays stream
        System.out.println(Arrays.stream(arr).min().getAsInt()); //10
        System.out.println(Arrays.stream(arr).max().getAsInt()); //90
    }

    // minimum element in the array
    public static int min(int[] arr) {
        int min = arr[0];
        for(int value : arr) {
            min = Math.min(value, min);
        }
        return min;
    }

    // maximum element in the array
    public static int max(int[] arr) {
        int max = arr[0];
        for(int value : arr) {
            max = Math.max(value, max);
        }
        return max;
    }
}
