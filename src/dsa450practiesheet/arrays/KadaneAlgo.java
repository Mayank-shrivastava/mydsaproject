package dsa450practiesheet.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Implementation of the Kadane Algorithm used to find the largest contiguous subarray sum
public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0) {
            int n = scn.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scn.nextInt();
            }
            int ans = solution(nums);
            System.out.println(ans);
        }
    }

    public static int solution(int[] nums) {
        int currSum = nums[0];
        int overAllSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currSum > 0) {
                currSum += nums[i];
            } else {
                currSum = nums[i];
            }
            //comparison with the overall sum
            if (currSum > overAllSum) {
                overAllSum = currSum;
            }
        }
        return overAllSum;
    }
}
