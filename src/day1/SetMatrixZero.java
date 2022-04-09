package day1;

//Reference Link: https://takeuforward.org/data-structure/set-matrix-zero/
//Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.
//
//        Examples:
//
//        Examples 1:
//
//        Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
//
//        Output: [[1,0,1],[0,0,0],[1,0,1]]
//
//        Explanation: Since matrix[2][2]=0.Therefore the 2nd column and 2nd row wil be set to 0.
//
//        Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//
//        Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
//
//        Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0

import java.util.Arrays;

public class SetMatrixZero {
//Simple approach
    void setMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int dummy1[] = new int[rows];
        int dummy2[] = new int[cols];
        Arrays.fill(dummy1, -1);
        Arrays.fill(dummy2, -1);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    dummy1[i] = 0;
                    dummy2[j] = 0;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dummy1[i] == 0 || dummy2[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

    //better approach

    void setNewMatrix(int [][]input)
    {
        
    }


    public static void main(String[] args) {
        SetMatrixZero smz = new SetMatrixZero();
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        smz.setMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}