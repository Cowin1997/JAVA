package Testopp;

import java.lang.reflect.*;

public class TestMethod {

	public static void main(String[]args){
		try {
		aemployee a=new aemployee();
		Method m=aemployee.class.getMethod("Show", String.class);
	//	TestMethod t=new TestMethod();
		Test("TestOutput",m,a);
		aemployee.Show("testoutput");
		}
		 catch(Exception e) {
			 e.getStackTrace();
		 }
		
	}

	public static void Test(String s, Method m,Object aem) {
		System.out.println(m);
		try {
			m.invoke(aem, s);
			
			//System.out.println(t);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
