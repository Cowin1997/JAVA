package edu.hqu.www;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Person {
	private String name;
	public abstract String getInfo();
	public Person(String n){
		name=n;
	}
	public String getname(){
		return name;
	}
}

 class BEmployee extends Person{
	 private double salary;
	 private Date hireday;
	 public BEmployee(String n,double s,int year,int month,int day) {
		 super(n);
		 salary=s;
		 GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
		 hireday=calendar.getTime();
	 }
	 public double getsalary(){
		 return salary;
	 }
	 public Date gethireday(){
		 return hireday;
	 }
	 public String getInfo(){
		 String s="hireday is:"+hireday+",salary is :"+salary;
		 return s;	 
	 }
}
  class Student extends Person{
	  private int No;
	  private double score;
	  private String subject;
	  public Student(String n,int No,double score,String subject) {
		  super(n);
		  this.No=No;
		  this.score=score;
		  this.subject=subject;
	  }
	  public int getno(){
		  return No;
	  }
	  public double getscore(){
		  return score;
	  }
	  public String getsubject(){
		  return subject;
	  }
	  @Override public String getInfo() {
		  return ",No is "+No+",subject is:  "+subject+",*score is : "
				  +score;
	  }
	  
  }