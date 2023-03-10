package chapter02_ex;
import java.util.Scanner;

public class ex02_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		input.close();
		
		double interest = balance * (annualInterestRate / 1200.0);
		
		System.out.println("The interest is "+(int)(interest * 100000) / 100000.0);
	}

}
/*
(Financial application: calculate interest) 
If you know the balance and the annual percentage interest rate, 
you can compute the interest on the next monthly payment using the following formula:
		interest = balance * (annualInterestRate/1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month.
*/