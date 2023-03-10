import java.util.Scanner;

public class Objective9Lab4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double num1, num2;

		System.out.println("Please give me a number: ");
		num1 = keyboard.nextDouble();
		System.out.println("Please give me another number: ");
		num2 = keyboard.nextDouble();

		double average = findAverage(num1, num2);
		System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);

		keyboard.close();
	}

	public static double findAverage(double x, double y) {
		double average = (x + y) / 2;
		return average;
	}
}