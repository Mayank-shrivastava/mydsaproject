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


    //Algo for selection sort ->
    // 1.counter goes from 0 to arr.length - 1(excluded)
    // 2.find min element index
    // 3.swap the element at min index to the element at counter value;
    public static void selectionSort(int[] arr) {
        //counter goes from 0 to arr.length - 1
        for(int counter = 0; counter < arr.length - 1; counter++) {
            int minIdx = counter;
            for(int j = counter + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            //swap value at minIdx and counter
            int temp = arr[minIdx];
            arr[minIdx] = arr[counter];
            arr[counter] = temp;
        }
    }

    //bubble-sort
        //basic idea -> compare each element with the adjacent element and
        //if the element is greater than the adjacent element swap both the elements
        //Performance of the bubble sort is not good for the large data set
        //Gives complexity of O(n^2) where n is the number of input data set
    private static void bubbleSort(int[] arr) {
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

    //Algo for insertion-sort ->
        // counter goes from index 1 to  arr.length - 1(included)
        // take value at counter index
        // shifting work
    public static void insertionSort(int[] arr) {
        for(int counter = 1; counter < arr.length; counter++) {
            int val = arr[counter];
            int j = counter - 1;
            //shifting work
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


