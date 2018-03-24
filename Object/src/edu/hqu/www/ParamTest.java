package edu.hqu.www;

public class ParamTest {

	public static void main(String[] args) {
		/////////////////////////////
		double X = 10;
		System.out.println("Before X is " + X);
		TripleValue(X);
		Employee a = new Employee("LiMing", 1);
		Employee b = new Employee("LinHong", 2);
		swap(a, b);
		System.out.println("Real:" + a.GetName() + " " + a.GetId());
		System.out.println("Real:" + b.GetName() + " " + b.GetId());
		Change(a);
		System.out.println(a.GetName() + " " + a.GetId());
	}

	public static void TripleValue(double x) {
		x = 3 * x;
		System.out.println("After X is " + x);
	}

	public static void swap(Employee x, Employee y) {
		Employee t;
		t = x;
		x = y;
		y = t;
		System.out.println("End of methord:" + x.GetName() + " " + x.GetId());
		System.out.println("End of methord:" + y.GetName() + " " + y.GetId());
	}

	public static void Change(Employee x) {
		x.ChangeName("ChangeName");
	}

}

class Employee {
	private String name;
	private int Id;

	public Employee(String n, int i) {
		name = n;
		Id = i;
	}

	public String GetName() {
		return name;
	}

	public int GetId() {
		return Id;
	}

	public void ChangeName(String x) {
		name = x;
	}
}
