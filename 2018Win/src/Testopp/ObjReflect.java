package Testopp;

import java.util.*;

public class ObjReflect {
	public static void main(String []args) {
		ArrayList<Integer>squares=new ArrayList<>();
		for(int i=1;i<=5;i++) 
			squares.add(i*i);
			System.out.println(new ObjectAnalyzer().toString(squares));		
	}

}


