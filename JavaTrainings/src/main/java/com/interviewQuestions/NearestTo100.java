package com.interviewQuestions;

import java.util.Scanner;

public class NearestTo100 {

	static int nearTo100(int i1,int i2){
		int dif1 = Math.abs(100-i1);
		int dif2 = Math.abs(100-i2);
		if(dif1<dif2)
			return i1;
		else return i2;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first no: ");
	int i1=sc.nextInt();
	System.out.println("enter second no: ");
	int i2=sc.nextInt();
	System.out.println(nearTo100(i1, i2));
}	
	
}
