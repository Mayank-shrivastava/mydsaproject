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
        // greedy-approach problem
        if(n == 1) {
            return 0;
        }

        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int small = arr[0] + k;
        int big = arr[n - 1] - k;
        if(small > big) {
            //swap small and big
            int temp = small;
            small = big;
            big = temp;
        }

        //traverse for the middle elements
        for(int i = 1; i < n - 1; i++) {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            if(subtract >= small || add <= big) {
                continue;
            }

            if(big - subtract <= add - small) {
                small = subtract;
            } else{
                big = add;
            }
        }

        return Math.min(ans, big - small);
    }
}
