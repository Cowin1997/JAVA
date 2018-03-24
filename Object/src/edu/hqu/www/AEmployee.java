package edu.hqu.www;

import java.util.Date;
import java.util.GregorianCalendar;

public class AEmployee {
	private String name;
	private double salary;
	private Date hireDay;	
     public  AEmployee(String n,double s,int year,int month,int day){
    	 name=n;
    	 salary=s;
    	 GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
    	 hireDay=calendar.getTime(); 	 
     }
     public  String getname() {
    	 return name;   	 
     }
     public double getsalary() {
    	 return salary;
     }
     public Date getDate() {
    	 return hireDay;
     }
     public void raiseSalary(double Bypercent) {
    	 salary=+salary*Bypercent/100;
     }
   // public static void main(String[]args) {
    	
  //8 }
}
  class Manager extends AEmployee //public Manger 必须在自己的class类中才能为public
 {
	 private double Other;
	 public Manager(String n,double s,int year,int month,int day,double O) {
		 super(n,s,year,month-1,day);
		 Other=O;
	 }
	 public double getsalary() {   //重载  overrides
		 double basesalary=super.getsalary();
		 return basesalary+Other;
	 }
	public void setOther(double o) {
		Other=o;
		
	}
 }
