package edu.hqu.www;



public class TestOLR {
	public static void main(String[] args) {
		employees a = new employees();
		a.show();
		employees b = new employees("LiMing", 1, 10000);
		b.show();
		b.Change("LINHONG", 2);
		b.show();
		b.Change(3, 2000000);
		b.show();
		//AEmployee A=new AEmployee("LIBAI", 2000,1997 , 9, 2);
		//Manager M=new Manager("LIBAI@",3000,1997,8,21);

	}

}

class employees {
	private String name;
	private int Id;
	private double salary;

	public employees() {
		name = "";
		Id = 0;
		salary = 0;
	}

	public employees(String n, int i, double s) {
		name = n;
		Id = i;
		salary = s;
	}

	public void Change(String s, int i) {
		name = s;
		Id = i;
	}

	public void Change(int i, double s) {
		Id = i;
		salary = s;

	}

	public void show() {
		System.out.println("姓名是:" + name + ",学号是" + Id + ",工资是" + salary);
	}
}