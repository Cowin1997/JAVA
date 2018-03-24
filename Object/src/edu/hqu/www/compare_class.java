package edu.hqu.www;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class compare_class {
	public static void main(String[]args) {
		/*
		CEmployee a=new CEmployee("LI",10000,2017,1,1);
		System.out.println(a.toString());
		CEmployee b=new CEmployee("LI",10000,2017,11,1);
		System.out.println(a.equales(b));
		*/
		CEmployee CEa=new CEmployee("LI",100000,2017,1,1);
		CManager  CMa=new CManager("LI",100000,2017,1,1,5000);
		//System.out.println(CMa.equales(CEa));
		CEmployee a=new CManager("LI",100000,2017,1,1,4000);
		System.out.println(a.equales(CEa));
		
	}
	

}
class CEmployee{
	private String name;
	private double salary;
	private Date hireday;
	
public CEmployee(String n,double s,int year,int month,int day) {
	name=n;
	salary=s;
	GregorianCalendar calendar= new GregorianCalendar(year,month-1,day);
	hireday=calendar.getTime();
}
public String getname() {
	return name;
}
public double getsalary() {
	return salary;
}
public double totalsalary(double increase) {
	return salary+salary*increase/100;
}
public Date gethireday() {
	return hireday;
}
public boolean equales(Object otherobject) {
	if(this==otherobject) return true;
	if(otherobject==null) return false;
	if(getClass()!=otherobject.getClass()) return false;
	else {
		CEmployee other=(CEmployee)otherobject;
		return Objects.equals(name, other.name)&&salary==other.salary
		&& Objects.equals(hireday, other.hireday);
		
	}	
}
public int hashCode() {
	return Objects.hash(name,salary,hireday);
}
public String toString() {
	return getClass().getName()+"[name="+name+",salary="+salary+",hireday="+hireday+"]";
//edu.hqu.www.CEmployee[name=LI,salary=10000.0,hireday=Sun Jan 01 00:00:00 CST 2017]	
}
}
class CManager extends CEmployee{
	private double bonus;
	public CManager(String n,double s,int year,int month,int day,double b) {
		super(n,s,year,month,day);
		bonus=b;
	}
	public double getsalary() {
		return super.getsalary()+bonus;
	}
	public boolean equales(Object otherobject) {
		if(!super.equales(otherobject)) return false;
		else{
			CManager other=(CManager)otherobject;
			return bonus==other.bonus;	
		}
	}
}
