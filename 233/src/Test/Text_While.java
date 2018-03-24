package Test;

import java.util.Scanner;

public class Text_While {
	public static void main(String[] args) {
		Scanner In=new Scanner(System.in);
		System.out.println("How much money do you need to retire?");
		double goal=In.nextDouble();
		System.out.println("How much money will you contribute every year?");
		double payment=In.nextDouble();
		System.out.println("Interest rate in %:");
		double rate=In.nextDouble();
		In.close();
		double balance=0;
		int years=0;
		while(balance<goal) {
			balance+=payment;
			double interest=balance*rate/100;
			balance+=interest;
			years++;
		}
		System.out.println("Years:"+years);	}


}
