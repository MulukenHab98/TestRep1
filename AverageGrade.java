package com.craftassignment;

import java.util.Scanner;

public class AverageGrade {

	public static void main(String[] args) {
		// Scanner
		Scanner in=new Scanner(System.in);
		// input accept
		System.out.println(" enter number of subject");
		int numberofsubject=in.nextInt();
		// array
		int scores[]=new int[numberofsubject];
		// loop
		for(int i=0;i<numberofsubject; i++) {
			System.out.print("the score of subject is" +(i+1)+":");
			scores[i]=in.nextInt();
		}
		int totalsum=0;
		for(int score:scores) {
			totalsum=totalsum+score;
			
		}
		double average=(double)totalsum/numberofsubject;
		System.out.println("average is"+average);
	}

}
