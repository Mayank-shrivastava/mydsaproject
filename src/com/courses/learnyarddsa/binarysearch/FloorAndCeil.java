package com.courses.learnyarddsa.binarysearch;

import java.util.Arrays;
// https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1
public class FloorAndCeil {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
        Arrays.sort(arr);
        int k = 7;
        System.out.println(findFloor(arr, k));
        System.out.println(findCeil(arr, k));
    }

    static int findCeil(int[] arr, int k) {
        // Ceil of x => smallest element which is >= k
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= k) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int findFloor(int[] arr, int k) {
        // Floor of x => largest element which is <= k
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= k) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
