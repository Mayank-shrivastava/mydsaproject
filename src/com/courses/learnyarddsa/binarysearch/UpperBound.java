package com.courses.learnyarddsa.binarysearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {6, 6, 6, 6, 7, 8, 8, 8};
        int target = 5;
        System.out.println(upperBound(arr, target));
    }

    // this code is intuitive for upper bound
    private static int upperBound(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                // upper bound means last true
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
