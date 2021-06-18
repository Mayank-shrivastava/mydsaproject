package dsa450practiesheet.arrays;

import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,3,3};
        int[] arr2 = {8,9,7,6,5,3};
        System.out.println(doUnion(arr1, arr2));
        System.out.println(doIntersection(arr1, arr2));
    }

    //function return the count of number of elements in union of two arrays
    public static int doUnion(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr1.length; i++) {
            map.put(arr1[i] , i);
        }
        for(int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        return map.size();
    }

    //function return count of number of elements in intersection of two arrays
    public static int doIntersection(int[] arr1, int[] arr2) {
        //intersection does not contains element greater than the smaller array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int ans = 0;
        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                i++;
            } else if(arr1[i] > arr2[j]) {
                j++;
            } else {
                //both are equal
                ans++;
                i++;
                j++;
            }
        }
        return ans;
    }
}
