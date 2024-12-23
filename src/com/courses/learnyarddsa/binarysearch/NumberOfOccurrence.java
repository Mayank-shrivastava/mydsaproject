package com.courses.learnyarddsa.binarysearch;

import java.util.Arrays;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 12, 12, 12};
        int target = 12;
        NumberOfOccurrence obj = new NumberOfOccurrence();
        //System.out.println(obj.countFreq(arr, target));
        System.out.println(Arrays.toString(obj.searchRange(arr, target)));
    }

    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1485578862/
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
        res[0] = lowerBound(nums, target, n);
        res[1] = upperBound(nums, target, n);
        return res;
    }

    /// Question Link:- https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
    int countFreq(int[] arr, int target) {
        // count frequency is done with
        // upper_bound of target - lower_bound of target + 1
        int n = arr.length;
        int lb = lowerBound(arr, target, n);
        if (lb == -1) return 0;
        int up = upperBound(arr, target, n);
        return up - lb + 1;
    }

    int lowerBound(int[] arr, int target, int n) {
        int start = 0, end = n-1;
        int ans = -1;
        while(start <= end) {
            int mid = (start+end)/2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }

    int upperBound(int[] arr, int target, int n) {
        int start = 0, end = n-1;
        int ans = -1;
        while(start <= end) {
            int mid = (start+end)/2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return ans;
    }
}
