package Test;

public class StaticTest {
	public static void main(String[]args){
		Employee1[]staff=new Employee1[3];
		staff[0]=new Employee1("Tom",40000);
		staff[1]=new Employee1("Dick",60000);
		staff[2]=new Employee1("Harry",80000);
		for(Employee1 e:staff) {
			e.setId();
			System.out.println("name:"+e.GetName()+" Salary:"+e.Getsalary()+" ,id:"+e.Getid()+" ,NextId:"
					+ e.GetNextId());
			
		}
			int n=Employee1.GetNextId();
			System.out.println("NextID:"+n);
		
	
	
}
	

	
	
	
	
}
	
	
	class Employee1{
		private static int NextId;
		private String name;
		private double salary;
		private int id;
		public Employee1(String n,double s) {
			name=n;
			salary=s;
		}
		public String GetName() {
			return name;
		}
		public double Getsalary() {
			return salary;
		}
		public int  Getid() {
			return id;
		}
		public void setId(){
			id=NextId;
			NextId++;
		}
		public static int  GetNextId() {
			return NextId;
		}
		public static void main(String[]args) {
			Employee1 e=new Employee1("Lilili",5000);
			System.out.println("name:"+e.GetName()+"Salary:"+e.Getsalary());
		}
		
		
	}
