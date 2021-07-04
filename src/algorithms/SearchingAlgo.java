package algorithms;

import java.util.Arrays;

public class SearchingAlgo {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60, 50, 40, 30, 20, 10};
        int[] arr3 = {34, 54, 25, 55, 64};
        System.out.println(linearSearch(50, arr1));
        System.out.println(binarySearch(50, arr1));
        System.out.println(Arrays.toString(arr1));
    }

    //Linear search/Sequential search
    public static int linearSearch(int item, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }


    //Binary Search
    public static int binarySearch(int item, int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        //int mid = (lo + hi) / 2;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < item) {
                lo = mid + 1;
            } else if (arr[mid] > item) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }

        //in case item is not found
        return -1;
    }

/*
    //bubble-Sort
    public static void bubbleSort(int[] arr) {
        for (int counter = 0; counter < arr.length - 1; counter++) {
            for (int j = 0; j < arr.length - 1 - counter; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap elements arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //selection sort
    public static void selectionSort(int[] arr) {
        int counter = 0;
        for (counter = 0; counter < arr.length - 1; counter++) {
            int min = counter;
            for (int j = counter + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            //swap min and arr[counter] element
            int temp = arr[min];
            arr[min] = arr[counter];
            arr[counter] = temp;
        }
    }

    //insertion sort
    public static void insertionSort(int[] arr) {
        for(int counter = 1; counter < arr.length; counter++) {
            int val = arr[counter];
            int j = counter - 1;
            //backwards loop or reverse loop
            while(j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = val;
        }
    }
*/
}
