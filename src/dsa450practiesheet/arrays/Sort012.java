package dsa450practiesheet.arrays;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        Sort012 obj = new Sort012();
        obj.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void sortColors(int[] nums) {
        // required three pointers low mid and high to seggregate the array in three part(0's, 1's, 2's)
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                //swap nums[mid] and nums[low]
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                //swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
