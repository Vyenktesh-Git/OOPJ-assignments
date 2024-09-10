package CompoundInterestCalculator;

import java.util.Scanner;

public class Program {

	 public static void main(String[] args) {
	        CompoundInterestCalculatorUtil util = new CompoundInterestCalculatorUtil();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            util.menuList();
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    util.acceptRecord();
	                    break;
	                case 2:
	                    util.printRecord();
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	                    break;
	            }
	        }
	    }
}
