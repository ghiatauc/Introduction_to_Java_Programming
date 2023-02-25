package chapter03_ex;
import java.util.Scanner;

public class ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		input.close();
		
		boolean hasSolution = a * d - b * c != 0;
		
		if(hasSolution) {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			
			System.out.println("x is "+x+" and y is "+y);
		}else {
			System.out.println("The equation has no solution");
		}

	}

}
/*
(Algebra: solve 2 * 2 linear equations)
A linear equation can be solved using Cramer’s rule given in Programming Exercise 1.13. 
Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
If ad - bc is 0, report that “The equation has no solution.”
*/