package BMICalculator;

import java.util.Scanner;

public class BMITrackerUtil {

	private static Scanner sc = new Scanner(System.in);
	
	public static BMITracker acceptRecord() {
		

		System.out.print("Enter weight: ");
		double weight = sc.nextDouble();

		System.out.print("Enter height: ");
		double height = sc.nextDouble();

		return new BMITracker(weight, height);
	}

	public static void printRecord(BMITracker bmiTracker) {
		System.out.println(bmiTracker);
	}

	public static void menu() {
		System.out.println("BMI Tracker Menu:");
		System.out.println("1. Calculate BMI");
		System.out.println("2. Exit");
	}
}
