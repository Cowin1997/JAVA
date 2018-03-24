package Test;

import java.util.Scanner;

public class Judge_Year {
	public static void main(String []args) {
		Scanner in=new Scanner(System.in);
		int year;
		System.out.println("please enter the year,that you want to judge:");
		year=in.nextInt();
		System.out.println((year%4==0)&&(year%100!=0)||(year%400==0));
		
	
	
	
	}

}
