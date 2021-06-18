package algorithms.recursion;

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

