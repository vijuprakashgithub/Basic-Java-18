package com.viju;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int row,col;
    System.out.println("Enter the values of row and column");
    row = input.nextInt();
    col = input.nextInt();
    int[][] matrix1 = new int[row][col];
    int[][] matrix2 = new int[row][col];
    int[][] matrix3 = new int[row][col];

    System.out.println("Enter the first matrix elements");
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
            matrix1[i][j]=input.nextInt();
        }
    }
    System.out.println("Enter second matrix elements");
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
            matrix2[i][j]=input.nextInt();
        }
    }
    System.out.println("Now the resultant matrix is");
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++) {
            matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            System.out.println(matrix3[i][j]+"\t");
            //System.out.println("\n");
        }
    }
    }
}