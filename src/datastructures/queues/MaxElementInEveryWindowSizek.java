package datastructures.queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxElementInEveryWindowSizek {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        printMax(arr, k);
    }

    public static void printMax(int[] arr, int k) {
        Deque<Integer> q = new LinkedList<>();
        int i;
        //refer to first window of size k
        for (i = 0; i < k; i++) {

        }


    }
}
