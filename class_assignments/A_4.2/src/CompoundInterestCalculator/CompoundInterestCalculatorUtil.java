package CompoundInterestCalculator;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {

	private CompoundInterestCalculator compoundCalculator;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Annual Interest Rate: ");
        double annualInterestRate = sc.nextDouble();
        System.out.print("Enter the Number of Times Interest is Compounded per Year: ");
        int numberOfCompounds = sc.nextInt();
        System.out.print("Enter the Investment Duration: ");
        int years = sc.nextInt();
        compoundCalculator = new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
    }

    public void printRecord() {
        if (compoundCalculator != null) {
            System.out.println(compoundCalculator.toString());
        } else {
            System.out.println("No investment details available.");
        }
    }

    public void menuList() {
        System.out.println("1. Accept Investment Details");
        System.out.println("2. Display Investment Details");
        
        
    }
}
