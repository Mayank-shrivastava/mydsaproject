package com.courses.learnyarddsa.binarysearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,3,3,5,5,5,5,8,9};
        int target = 5;
        System.out.println(lowerBound(arr, target));
    }

    private static int lowerBound(int[] arr, int target) {
        int n = arr.length - 1;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
