package algorithms;

import java.util.Arrays;

public class SortingAlgo {
    public static void main(String[] args) {
        int[] arr = {14, 33, 27, 35, 10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {12,14,54,5,4};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {88, 11, 44, 99, 33};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }


    //selection-sort
    private static void selectionSort(int[] arr) {
        // basic idea ->
        //       find the min element from the unsorted arr and put that element to the starting of the sorted arr
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
                //swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    //bubble-sort
    private static void bubbleSort(int[] arr) {
        //basic idea -> compare each element with the adjacent element and
        //if the element is greater than the adjacent element swap both the elements
        //Performance of the bubble sort is not good for the large data set
        //Gives complexity of O(n^2) where n is the number of input data set

        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int j = 0; j < arr.length - 1 - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //insertion-sort
    private static void insertionSort(int[] arr) {
        for(int counter = 1; counter < arr.length; counter++) {
            int val = arr[counter];
            int j = counter - 1;
            while(j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = val;
        }
    }

    //quick-sort
    private static void quickSort(int[] arr) {

    }

    //merge-sort
    private static void mergeSort(int[] arr) {
        //recursion based algorithm

    }

}


