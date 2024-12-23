package com.courses.learnyarddsa.binarysearch;

public class Sqrt {
    public static void main(String[] args) {
        int target = 4;
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(target));
    }

    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        long ans = -1;
        while(start <= end) {
            long mid = (start + end) / 2;
            if (mid * mid <= x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int)ans;
    }
}
