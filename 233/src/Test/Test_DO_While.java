package Test;

import java.util.Scanner;

public class Test_DO_While {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you need to retire?");
		double goal = in.nextDouble();
		System.out.println("How much money will you contribute every year?");
		double payment = in.nextDouble();
		System.out.println("InterestRate is %");
		double Rate = in.nextDouble();
		double balance = 0;
		int years = 0;
		String input;
		do {
			balance += payment;
			double RateMoney = balance * Rate / 100;
			balance += RateMoney;
			years++;
			System.out.println("your money is " + balance + "    in  " + years + "  years");
			System.out.println("your goal is " + goal);
			System.out.println("Ready to retire?(Y/N)");

			input = in.next();
		} while (input.equals("N"));
		in.close();

	}

}
