package com.craftAssignment;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		

		Scanner in=new Scanner(System.in);
		
		System.out.println(" enter rows:");
		int rows=in.nextInt();
		System.out.println(" enter the number of column:");
		int columns=in.nextInt();
		
	int [][] A =new int[rows][columns];
	int [][] B= new int[rows][columns];
    int [][]result=new int[rows][columns];
    
    System.out.println(" element of matrix A:");
    for(int i=0; i<rows; i++){
      for (int j=0; j<columns; j++){
    	 A[i][j] = in.nextInt(); 
    	  }
      }
   
    System.out.println("element of matrix B:");
    	  for(int i=0;i<rows; i++) {
    		  for(int j=0; j< columns;j++) {
    			 B[i][j]=in.nextInt();
    		  }
    	  }
    	  
    	  for(int i=0; i<rows; i++) {
    		  for (int j=0;j<columns; j++) {
    	 result[i][j]=A[i][j]+B[i][j];
    		  }
    	  }
    	 
    	  System.out.println("sum of matrix");
    	 
    	  for(int i=0; i<rows;i++) {
    		  for(int j=0;j<columns; j++) {
    			  System.out.print(result[i][j] +"\t" );  
    		  }
    		  System.out.println();
    	  }
    	
    }
	
    
    }

