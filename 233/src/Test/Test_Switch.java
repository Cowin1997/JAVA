package Test;

import java.util.Scanner;

public class Test_Switch {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("input string Yes/No/Others");
	String input=in.nextLine();
	switch(input) {
	case "Yes":System.out.println("Yes!");break;
	case "No": System.out.println("No£¡");break;
	default:System.out.println("Else");
	}
	in.close();
	
	}
}
