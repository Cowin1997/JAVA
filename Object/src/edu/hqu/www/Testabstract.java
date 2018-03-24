package edu.hqu.www;

public class Testabstract {
	public static void main(String[]args) {
		Person[]staff=new Person[2];
		staff[0]=new BEmployee("FirstPerson",5000,2017,11,11);
		staff[1]=new Student("SecondPerson",2,100,"Math");
		
	for(Person p:staff)
		System.out.println(p.getname()+"****"+p.getInfo());
	
	}
}
