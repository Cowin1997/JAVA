package Test;

import java.util.*;

/**
 * 
 * @author LiXiBin
 * �Ҿ��Կ���
 *
 */

public class EmployeeTest {
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[]args) {
	
		Employee[]staff=new Employee[3];
		staff[0]=new Employee("Carl Cracker",75_000,1987,12,15);
		staff[1]=new Employee("Harry Hacker",50_000,1989,10,1);
		staff[2]=new Employee("Tony Tester",40_000,1990,3,15);
		for(Employee e:staff)
			e.RaiseSalary(5);
		for(Employee e:staff)
			System.out.println("name:"+e.GetName()+",Saraly="+e.GetSalary()+",hireDay="+e.GetDate());
	}
	
	
}
	
/**
 * Employee��
 * @author admin
 *
 */
	 class Employee{
		private String name;
		private double salary;
		private Date hireday;
		/**
		 * 1
		 * @param n
		 * @param s
		 * @param year
		 * @param month
		 * @param day
		 */
		public Employee(String n,double s,int year,int month,int day){
			name=n;
			salary=s;
			GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
			hireday=calendar.getTime();		
		}
		public String GetName() {
			return name;
		}
		public double GetSalary() {
			return salary;
		}
		public Date GetDate() {
			return hireday;
		}
		public void RaiseSalary(double bypercent) {
			double raise=salary*bypercent/100;
			salary+=raise;
		}

}
	
	
	
	
	

