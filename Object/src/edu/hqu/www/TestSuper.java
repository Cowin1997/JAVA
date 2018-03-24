package edu.hqu.www;

public class TestSuper {
	public static void main(String[]args){
		AEmployee[]staff=new AEmployee[4];
		Manager boss=new Manager("BOSS",10000,2017,11,11,10000);
		staff[0]=boss;
		staff[1]=new AEmployee("First",5000,2017,10,11);
		staff[2]=new AEmployee("Second",4000,1997,8,21);
		staff[3]=new AEmployee("Third",3000,2011,5,7);
		for(AEmployee e:staff) {
			System.out.println("Name: "+e.getname()+" Salary: "+e.getsalary()+" Date: "+e.getDate());
		}

	}
}
