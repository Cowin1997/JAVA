package Testopp;

public class testintenceof {
	private class employee{
		int Id;
		String name;
		double salary;
		public employee(int id,String name,double s) {
			this.Id=id;
			this.name=name;
			this.salary=s;
			
		}
		public boolean equals(Object otherobject) {
			if(!(otherobject instanceof employee))
				return false;
			else return true;
		}
		public String getname() {
			return this.name;
		}
	}
	private class Manager extends employee{
		double managersalary;
		public Manager(int id,String name,double s,double ms) {
			super(id, name, s);
			this.managersalary=ms;
			
		}
		public boolean equals(Object otherobject) {
			if(!(otherobject instanceof Manager))
				return false;
			else return true;
		}
		public int getmanagersalary() {
			return this.getmanagersalary();
		}
	}
	public static void main(String args[]) {
		testintenceof in=new testintenceof();
		employee e=in.new employee(1001,"LiMIng",1111);
		System.out.println(e.getname());
		Manager m=in.new Manager(1002,"Boss",1111,1111);
		System.out.println(e.equals(m));//true
		System.out.println(m.equals(e));//false
		employee E=m;
		System.out.println(E.getname());//Boss
		//Manager M=(employee)e;
	}
}
