package Testopp;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.*;
import java.util.*;

public class ObjectAnalyzer {
	private ArrayList<Object>visited=new ArrayList<>();
	
	
	public String toString(Object obj) {
		if(obj==null) return "null";
		if(visited.contains(obj))  return "...";
		visited.add(obj);
		Class c1=obj.getClass();
		if(c1==String.class) {return (String)obj;}
		if(c1.isArray()) {
			String r=c1.getComponentType()+"[]{";//class java.lang.Object[]{
			//String t=c1.getComponentType()+"Look!";
		//	System.out.println(r);
			for(int i=0;i<Array.getLength(obj);i++) {
				if(i>0) r+=",";
				Object val=Array.get(obj, i);
				if(c1.getComponentType().isPrimitive())  r+=val;// { r+=val; System.out.println("123"+r);}
				else 
					r+=toString(val);
			}//for
			 // System.out.println(r+"}");
			return r+="}";
			
		}//if
		String r=c1.getName();//java.lang.Integer
		do {
			r+="[";
			Field[]fields=c1.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);
			for(Field f:fields) {
				if(!Modifier.isStatic(f.getModifiers())) {
					if(!r.endsWith("[")) r+=",";
					r+=f.getName()+"=";//java.lang.Integer[value=
					//System.out.println(r);
					try {
						Class t=f.getType();
						Object val=f.get(obj);
						if(t.isPrimitive())   {r+=val;	}//System.out.println(r);}
						else
							r+=toString(val);
						//System.out.println(r);
					}//try
					catch (Exception e) {
						e.printStackTrace();
					}//catch
				}//if
			}//for
			r+="]";
		//	System.out.println(r);
			c1=c1.getSuperclass();
			}//do
		while(c1!=null);
	//	System.out.println(r);
		return r;
	}//toString

}//class
