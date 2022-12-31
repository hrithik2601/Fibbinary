package com.prep.pattern;
import java.util.Scanner;
public class Fibbinary {

	public static void main(String[] args) {
		System.out.println("Enter num: ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int binary = 0, i=1,sum =0;
		boolean flag = true;
		while(num > 0) {
			int rem = num % 2;
			binary = rem * i;
			i = i * 10;
			sum = sum + binary;
			num = num/2;
			int rem1 = sum % 100;
			if((rem1 == 11 || rem1 == 10) && rem == 1) {
				flag = false;
				break;
			}
			
		}
		if(flag)  System.out.println("Yes");
		else  System.out.println("No");
	}

}
