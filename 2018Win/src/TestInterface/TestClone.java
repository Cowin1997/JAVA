package TestInterface;

import java.util.*;

public class TestClone {
	public static void main(String[]args) {
		try {
		AEmployee original=new AEmployee("Original",5000);
		original.SetDate(2000, 1, 1);
		AEmployee copy=original.clone();
		copy.SetDate(2018, 2, 20);
		System.out.println("original:"+original);
		System.out.println("copy:"+copy);
		String t="Hello";
		String tt=new String("Hello");
		System.out.println(t==tt);//false 比较地址
		System.out.println(original.GetName()==copy.GetName());//true 然而它这里的String name 并没有实现克隆
		//指向相同的地址
		
		
		
		}
		catch(CloneNotSupportedException e){
			e.getStackTrace();
			System.out.println("CloneNotSupportedException");
			
		}
		
	}

}

class AEmployee implements Cloneable{//implements Cloneable
	private String name;
	private double salary;
	private Date hireday;
	public AEmployee(String name,double salary) {
		this.name=name;
		this.salary=salary;
		this.hireday=new Date();
	}
	public void SetDate(int year,int month,int day) {
		Date d=new GregorianCalendar(year,month-1,day).getTime();
		hireday.setTime(d.getTime());
	}
	public AEmployee clone() throws CloneNotSupportedException{
		AEmployee cloned=(AEmployee)super.clone();
		cloned.hireday=(Date)hireday.clone();
		return cloned;
	}
	public String GetName() {
		return this.name;
	}
	
}