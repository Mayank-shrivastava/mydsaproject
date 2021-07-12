package algorithms.recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {40,20,90,30,70,10,80,60,50};
        quick_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick_sort(int[] arr, int lo, int hi) {
        //base-case
        if(lo >= hi) {
            return;
        }
        int mid = (lo+hi)/2;
        int pivot = arr[mid];
        int left = lo;
        int right = hi;

        while(left <= right) {
            while(arr[left] < pivot) {
                left++;
            }
            while(arr[right] > pivot) {
                right--;
            }
            if(left<=right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            //smaller problems
            quick_sort(arr,lo,right);
            quick_sort(arr,left,lo);
        }
    }
}
