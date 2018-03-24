package edu.hqu.www;

import java.util.Random;

public class ConstructorTest {
	public static void main(String[] args) {
		
		employee1[] staff = new employee1[3];
		staff[0] = new employee1("Harry", 1000);
		staff[1] = new employee1();
		staff[2] = new employee1(6000);
		for (employee1 e : staff) {
			System.out.println(e.getname() + " " + e.getId() + " " + e.getsalary());
		}

	}

}

class employee1 {
	private String name = "";
	private int ID;
	private double salary;
	private static int nextId;

	static {
		Random R = new Random();// 0-9999
		nextId = R.nextInt(10000);// 0-10000-1
		System.out.println(nextId);
	}
	{
		ID = nextId;
		nextId++;
	}

	public employee1(String aname, double asalary) {
		name = aname;
		salary = asalary;
	}

	public employee1(double s) {
		this("employee#" + nextId, s);
	}

	public employee1() {

	}

	public String getname() {
		return name;
	}

	public int getId() {
		return ID;
	}

	public double getsalary() {
		return salary;
	}

	public static int getnextId() {
		return nextId;
	}
}