package Testopp;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public abstract class test {
	public static void main(String args[]) {
	Person []p=new Person[2];
	String name=null;
	String major=null;
	int year;
	int month;
	int day;
	double salary;
	Scanner in=new Scanner(System.in);
		System.out.println("Please enter firsr Person's name:");
		name=in.nextLine();
		System.out.println("Please enter first Person's major:");
		major=in.nextLine();	
		p[0]=new Student(name,major);
		p[0].GetDesc();
		System.out.println("Please enter second Person's name:");
		name=in.nextLine();
		System.out.println("Please enter the salary,year,month,day:");
		salary=in.nextInt();
		year=in.nextInt();
		month=in.nextInt();
		day= in.nextInt();
		p[1]=new employee(name,salary,year,month,day);
		p[1].GetDesc();
		in.close();
		
	
	}
}
abstract class Person{
	public abstract void GetDesc();
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String Getname() {
		return this.name;
	}
}
class Student extends Person{
	private String major;
	public Student(String name,String major) {
		super(name);
		this.major=major;
		
	}
	public void GetDesc() {
		System.out.println("name is:"+super.Getname()+",major is:"+this.major);	
	}

}
class employee extends Person{
	private double salary;
	private Date day;
	public  employee(String name,double s,int year,int month,int day) {
		super(name);
		salary=s;
		GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
		this.day=calendar.getTime();
	}
	public void GetDesc() {
		System.out.println("name is:"+super.Getname()+",salary is:"+this.salary+",Date is:"+day);
	}
}
