package algorithms.recursion;

import java.util.Arrays;

public class r1 {
    public static void main(String[] args) {
        //recursive print
        //printDecreasing(5);
        //PDI(5);
        //System.out.println(fact(4));
        //System.out.println(power(2,5));
        //System.out.println(nthFib(6));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 1));
        int[] arr2 = {6, 8, 1, 1, 8, 3, 4};
        System.out.println(firstIndex(arr2, 0, 8));
        System.out.println(lastIndex(arr2, 0, 8));
        //pattern execution
        pattern(5, 1, 1);
        //bubble-sort execution
        int[] arr3 = {50,40,30,20,10};
        bubbleSort(arr3, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(allIndices(arr2, 0, 8, 0)));

    }

    //program to return an array containing all indices at which the element is present
    public static int[] allIndices(int[] arr, int si, int data, int count) {
        //base-case
        if(si == arr.length) {
            int[] base = new int[count];
            return base;
        }
        int[] indices = null;
        if(arr[si] == data) {
            indices = allIndices(arr, si + 1, data, count + 1);
        } else {
            indices = allIndices(arr, si + 1, data, count);
        }
        if(arr[si] == data) {
            indices[count] = si;
        }
        return indices;
    }

    //bubble-sort using recursion
    public static void bubbleSort(int[] arr, int si, int li) {
        //base-case
        if(li == 0) {
            return;
        }
        if(si == li) {
            bubbleSort(arr, 0, li - 1);
            return;
        }
        if(arr[si] > arr[si + 1]) {
            //swap
            int temp = arr[si];
            arr[si] = arr[si + 1];
            arr[si + 1] = temp;
        }
        bubbleSort(arr, si + 1,li);
    }

    //pattern
    public static void pattern(int N, int row, int col) {
        //base-case
        if(row > N) {
            return;
        }
        if(col > row) {
            System.out.println();
            pattern(N,row + 1, 1);
            return;
        }
        System.out.print("*");
        pattern(N, row, col + 1);
    }

    //last-index
    public static int lastIndex(int[] arr, int si, int data) {
        //base-case
        if(si == arr.length) {
            return -1;
        }
        int index = lastIndex(arr, si + 1, data);
        if(index == -1) {
            if(arr[si] == data) {
                return si;
            } else {
                return -1;
            }
        } else {
            return index;
        }
    }

    //first-index
    public static int firstIndex(int[] arr, int si, int data) {
        //base case
        if (si == arr.length) {
            return -1;
        }
        if (arr[si] == data) {
            return si;
        } else {
            int idx = firstIndex(arr, si + 1, data);
            return idx;
        }
    }


    public static boolean isSorted(int[] arr, int si) {
        if (si == arr.length - 1) {
            return true;
        }
        if (arr[si] > arr[si + 1]) {
            return false;
        } else {
            boolean response = isSorted(arr, si + 1);
            return response;
        }
    }

    public static int nthFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int fibn = nthFib(n - 1) + nthFib(n - 2);
        return fibn;
    }

    public static int power(int x, int n) {
        //base-case
        if (n == 1) return x;
        int ans = x * power(x, n - 1);
        return ans;
    }

    public static void printDecreasing(int n) {
        //base case
        if (n == 0) return;
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static int fact(int n) {
        //base-case
        if (n == 1) return 1;
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void PDI(int n) {
        //base case
        if (n == 0) return;
        System.out.println(n);
        PDI(n - 1);
        System.out.println(n);
    }
}

