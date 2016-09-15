package com.bayviewglen.dayfour;

public class HomeworkTwo {

	public static void main(String[] args) {
		double testTotal = 180;
		System.out.println("The test is out of " + testTotal);
		
		double studentMark = 90;
		System.out.println("The student got a mark of: "+ studentMark);
		
		double markDecimalValue = studentMark / testTotal;
		double markPercentageValue = markDecimalValue * 100;
		
		System.out.println("The student got a percentage of: " + (int)(markPercentageValue) + "%");
	}

}
