


import java.util.Scanner;

public class QbrRating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a number for touchdowns ");
		double number1 = input.nextDouble();
		
		System.out.print("Enter a number for passing yards ");
		double number2 = input.nextDouble();
		
		System.out.print("Enter a number for interceptions ");
		double number3 = input.nextDouble();
		
		System.out.print("Enter a number for pass completions ");
		double number4 = input.nextDouble();
		
		System.out.print("Enter a number for pass attempts ");
		double number5 = input.nextDouble();
		
		double a = ((number4 / number5) - 0.3) * 5.0;
		double b = ((number2 / number5) - 3.0) * 0.25;
		double c = (number1 / number5) * 20.0;
		double d = (2.375 - (number3 / number5) * 25.0);
		double qbr = ((a + b + c + d) / 6.0) * 100.0;
		
		System.out.println("The total qbr for this player is " + qbr);
	
		
		
	}

}
