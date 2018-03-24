package Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time_Test {
	public static void main(String[]args) {
		GregorianCalendar now=new GregorianCalendar();
		System.out.println();
		int month=now.get(Calendar.MONTH);
		int year=now.get(Calendar.YEAR);

		System.out.println("Month: "+month+"  Year: "+year);
		now.set(Calendar.MONTH, 11);
		now.set(Calendar.YEAR, 2018);
		 month=now.get(Calendar.MONTH);
		 year=now.get(Calendar.YEAR);
		System.out.println("Month: "+month+"  Year: "+year);
		now.add(Calendar.YEAR, 100);
		month=now.get(Calendar.MONTH);
		 year=now.get(Calendar.YEAR);
		 System.out.println("Month: "+month+"  Year: "+year);
	}
}
