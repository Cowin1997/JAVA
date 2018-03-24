package Testopp;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class testarrylist {
	public static void main(String[] args) {
		ArrayList<Bemployee> staff = new ArrayList<>();// ArrayList 是泛型类
		staff.add(new Bemployee("Employee1", 2001, 1997, 8, 21));
		staff.add(new Bemployee("Employee2", 1553, 2005, 9, 1));
		staff.add(new Bemployee("Employee3", 201, 2565, 8, 21));
		staff.add(new Bemployee("Employee4", 2541, 2018, 4, 5));
		for (Bemployee e : staff) {
			e.raisesalary();
			System.out.println(e.getName() + ";" + e.getSalary() + ";" + e.getDay());
		}
	}

}

class Bemployee {
	private String name;
	private double salary;
	private Date day;

	public Bemployee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar t = new GregorianCalendar(year, month - 1, day);
		this.day = t.getTime();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public void raisesalary() {
		this.salary++;
	}

}
