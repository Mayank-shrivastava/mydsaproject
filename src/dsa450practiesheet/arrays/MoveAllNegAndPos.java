package dsa450practiesheet.arrays;

// In this question we have to move all negative numbers to the beginning to the array and all positive numbers to the end

import java.util.Arrays;

public class MoveAllNegAndPos {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        method1Move(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        method2Move(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    //simple-loop approach(partition process in quicksort)
    public static void method1Move(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                if (i != j) {
                    //swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    //two-pointers approach
    public static void method2Move(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            if(arr[left] < 0 && arr[right] < 0) {
                left++;
            } else if(arr[left] < 0 && arr[right] > 0) {
                left++;
                right--;
            } else if(arr[left] > 0 && arr[right] < 0) {
                //swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else {
                right--;
            }
        }
    }
}
