package com.week1;

import java.util.Arrays;

//The question is given below
//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] mat={
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5},
        };
        setZeroes(mat);

        for (int[] arr:mat) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void setZeroes(int[][] matrix) {
        boolean isCol=false;
        int r= matrix.length;
        int c= matrix[0].length;

        for (int i = 0; i < r; i++) {
            if (matrix[i][0]==0){
                isCol=true;
            }

            for (int j = 1; j < c; j++) {
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if (matrix[0][0]==0){
            for (int i=1;i<c;i++){
                matrix[0][i]=0;
            }
        }

        if (isCol){
            for (int i = 0; i < r; i++) {
                matrix[i][0]=0;
            }
        }


    }
}
