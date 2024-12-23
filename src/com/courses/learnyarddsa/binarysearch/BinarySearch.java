package com.courses.learnyarddsa.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }

    // standard algorithm implementation of binary search
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                // means target is greater than arr of mid
                start = mid + 1;
            } else {
                // means target is less than arr of mid
                end = mid - 1;
            }
        }
        return -1;
    }
}
