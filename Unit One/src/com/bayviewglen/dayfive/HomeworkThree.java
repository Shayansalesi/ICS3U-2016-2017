package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int fiveDigitNumber;
		
		System.out.print("Print a 5 digit integer: ");
		fiveDigitNumber = scanner.nextInt();
		
		double secondDigit = (((((double)(fiveDigitNumber)/10))%1000)%100)%10;
		double fourthDigit = ((double)(fiveDigitNumber)/1000)%10;
		
		int product = (int)(secondDigit)*(int)(fourthDigit);
		
		System.out.println("The product of the second and fourth digit is: " + product);

	}

}
