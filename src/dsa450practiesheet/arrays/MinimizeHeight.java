package dsa450practiesheet.arrays;

import java.util.Arrays;

public class MinimizeHeight {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 5;
        MinimizeHeight obj = new MinimizeHeight();
        System.out.println(obj.getMinDiff(arr, arr.length, k));
    }

    public int getMinDiff(int[] arr, int n, int k) {
        // k = modifying factor
        // n = length  of the array
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] - k > 0) {
                arr[i] = arr[i] - k;
            } else {
                arr[i] = arr[i] + k;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arr.length - 1] - arr[0];
    }
}
