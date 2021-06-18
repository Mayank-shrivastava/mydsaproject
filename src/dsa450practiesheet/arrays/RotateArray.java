package dsa450practiesheet.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        long[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
        long n = arr.length;
        RotateArray obj = new RotateArray();
        obj.rotate(arr, n);
        System.out.println(Arrays.toString(arr));

    }

    // after looking at long think about the efficient algorithm
    public void rotate(long[] arr,long n) {
        long val = arr[0];
        arr[0] = arr[arr.length - 1];

        for(int i = 1; i < arr.length; i++) {
            long temp = arr[i];
            arr[i] = val;
            val = temp;
        }
    }
}
