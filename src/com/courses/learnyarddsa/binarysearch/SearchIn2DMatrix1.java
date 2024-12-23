package com.courses.learnyarddsa.binarysearch;

public class SearchIn2DMatrix1 {
    public static void main(String[] args) {

    }

    // matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0, j = m-1;
        while(i < n && j >= 0) {
            if(matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
