package DiscountCalculator;

import java.util.Scanner;

public class Program {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		DiscountCalculator discountCalculator = null;
//		DiscountCalculatorUtil util = new DiscountCalculatorUtil();

		while (true) {
			DiscountCalculatorUtil.menu();
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				discountCalculator = DiscountCalculatorUtil.acceptRecord();
				break;

			case 2:
				DiscountCalculatorUtil.printRecord(discountCalculator);
				break;

			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}
}
