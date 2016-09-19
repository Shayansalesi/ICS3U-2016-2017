package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double finalVelocity, initialVelocity, accelerationCar, timeCar;
		
		System.out.print("Enter the initial velocity: ");
		initialVelocity = scanner.nextDouble();
		
		System.out.print("enter the acceleration of the car: ");
		accelerationCar = scanner.nextDouble();
		
		System.out.print("enter the time that has elapsed: ");
		timeCar = scanner.nextDouble();
		
		finalVelocity = initialVelocity + (accelerationCar*timeCar);
		
		System.out.println("the final velocity of the car is: " + finalVelocity);

	}

}
