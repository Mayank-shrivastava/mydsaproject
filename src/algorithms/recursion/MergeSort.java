package algorithms.recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {5,15,30,45,60,70,80};
        System.out.println(Arrays.toString(mergeTwoSortedArrays(arr1, arr2)));
        int[] arr3 = {20,10,30,50,60,5,80,25};
        System.out.println(Arrays.toString(merge_sort(arr3, 0, arr3.length - 1)));
    }

    public static int[] merge_sort(int [] arr, int lo , int hi) {
        //base-case
        if(lo == hi) {
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }
        int mid = (lo + hi) / 2;
        int[] fh = merge_sort(arr, lo, mid);
        int[] sh = merge_sort(arr, mid + 1, hi);
        int[] merge = mergeTwoSortedArrays(fh, sh);
        return merge;
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] mergeArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j != arr2.length) {
            if(arr1[i] < arr2[j]) {
                mergeArr[k] = arr1[i];
                k++;
                i++;
            } else {
                mergeArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(i == arr1.length) {
            while(j < arr2.length) {
                mergeArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(j == arr2.length) {
            while(i < arr1.length) {
                mergeArr[k] = arr1[i];
                i++;
                k++;
            }
        }
        return mergeArr;
    }
}
