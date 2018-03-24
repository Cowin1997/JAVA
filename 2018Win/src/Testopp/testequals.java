package Testopp;

import java.util.Objects;

public class testequals {
	public static void main(String []args) {
	aemployee a=new aemployee(1001,"LIMING",2333);
	aemployee b=new aemployee(1001,"LIMING",2333);
	System.out.println(a.equals(b));
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());


}
}
class aemployee{
	int id;
	String name;
	double salary;
	public aemployee() {}
	public aemployee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void Desc() {
		System.out.println("Employee's name is:"+this.name+",and salary is:"+this.salary);
	}
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null) return  false;
		if(this.getClass()!=obj.getClass()) return false;
		aemployee  t=(aemployee)obj;
		return (t.id==this.id)&&(t.salary==this.salary)&&(Objects.equals(this.name, t.name));
		
	}
	public int hashCode() {
		return Objects.hash(id,name,salary);
	}
	public static void Show(String s) {
		System.out.println(s);
	}
	
}
