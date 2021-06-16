package datastructures.arrays.twodimensional;

public class q1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printWaveRowWise(arr);
        printSpiralWise(arr);
    }

    //wave print
    public static void printWaveRowWise(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //spiral print
    public static void printSpiralWise(int[][] arr) {
        //need six parameters
        int top, bottom, left, right, count, dir;
        top = 0;
        bottom = arr.length - 1;
        left = 0;
        right = arr[top].length - 1;
        dir = 1;
        count = (bottom + 1) * (right + 1);

        while(left <= right && top <= bottom) {
            if(count > 0) {
                if(dir == 1) {
                    for(int i = left; i <= right; i++) {
                        System.out.print(arr[top][i] + " ");
                        count--;
                    }
                    dir = 2;
                    top++;
                }
            }
            if(count > 0) {
                if(dir == 2) {
                    for(int i = top; i <= bottom; i++) {
                        System.out.print(arr[i][right] + " ");
                        count--;
                    }
                    dir = 3;
                    right--;
                }
            }
            if(count > 0) {
                if(dir == 3) {
                    for(int i = right; i >= left; i--) {
                        System.out.print(arr[bottom][i] + " ");
                        count--;
                    }
                    dir = 4;
                    bottom--;
                }
            }
            if(count > 0) {
                if(dir == 4) {
                    for(int i = bottom; i >= top; i--) {
                        System.out.print(arr[i][left] + " ");
                        count--;
                    }
                    dir = 1;
                    left++;
                }
            }
        }
    }
}
