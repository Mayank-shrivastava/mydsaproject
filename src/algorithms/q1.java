package algorithms;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,3,3,9,11};
        System.out.println(lowerBound(arr,2));
        System.out.println(upperBound(arr,2));
    }

    public static int lowerBound(int[] arr, int data) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == data) {
                ans = mid;
                high = mid - 1;
            } else if(data < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int data) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        if(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == data) {
                ans = mid;
                low = mid + 1;
            } else if(data < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
