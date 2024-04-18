package guvitask;

import java.util.Scanner;

public class ReversedNumber {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numnber : ");
		int number = sc.nextInt();
		
		int reversedNumber = reverseNumber(number);
		System.out.println("Reversed number: " + reversedNumber);
		
		sc.close();
	}
	
	public static int reverseNumber(int number) {
		int reversedNumber = 0;
		
		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /=10;
		}
		return reversedNumber;
	}
	
	

	}



