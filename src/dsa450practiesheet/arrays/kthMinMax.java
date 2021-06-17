package dsa450practiesheet.arrays;

import java.util.Arrays;

public class kthMinMax {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 20, 15};
        int k = 4;
        System.out.println(kthMin(arr, k));
        int[] arr1 = {3,2,1,5,6,4};
        int k1 = 2;
        System.out.println(kthMax(arr1, k1));
    }

    //kth-min element in the array
    public static int kthMin(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    //kth-max element in the array
    public static int kthMax(int[] arr, int k) {
        Arrays.sort(arr);
        int r = arr.length - 1;
        return arr[r - (k - 1)];
    }
}
