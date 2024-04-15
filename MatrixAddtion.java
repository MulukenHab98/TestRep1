package com.craftassignment;

import java.util.Scanner;

public class MatrixAddtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// input from keyboard
		Scanner in=new Scanner(System.in);
		
	// accept number of row and column
		System.out.println(" enter number of rows");
		int rows=in.nextInt();
		System.out.println(" enter number of column");
		int columns=in.nextInt();
		// array declare
		int [][]A= new int [rows][columns];
		int [][]B= new int[rows][columns];
		int [][] result=new int[rows][columns];
		// we start matrix
		// matrix A
		System.out.println(" enter elements of matrix A");
		for(int i=0; i< rows; i++) {
			for(int j=0; j<columns; j++) {
			A[i][j]=in.nextInt();
			}
		}
		// for matrix B
		System.out.println(" enter element of matrix B");
		
		for(int i=0;  i<rows; i++) {
			for(int j=0;j<columns; j++) {
				B[i][j]=in.nextInt();
			}
		}
		// sum
		System.out.println(" sum of matrix :");
		for(int i=0; i<rows;i++) {
			for(int j=0;j<columns; j++) {
				result[i][j]=A[i][j]+B[i][j];
			}
		}
		// display 
		for(int i=0; i<rows;i++) {
			for(int j=0;j<columns; j++) {
				System.out.print(result[i][j] +"\t");
			}
			System.out.println();
		}
		}

}
