package Testopp;

import java.lang.reflect.*;
import java.util.*;

public class TestReflect {
	public static void main(String []args) {
		String name;
		if(args.length>0) 
			name=args[0];
		else {
			Scanner in= new Scanner(System.in);
			System.out.println("请输入完整的类的名称，例如java.util.Date");
			name=in.nextLine();//手动输入类名，应该是完整的类名
		}
		
		try {
			//输出类名和超类名
			Class c1=Class.forName(name);
			Class c2=c1.getSuperclass();
			String modifiers=Modifier.toString(c1.getModifiers());//Modifier类的这个getM方法返回的是一个整数，代表修饰符 public private等
			if(modifiers.length()>0) System.out.print(modifiers+" ");
			System.out.println("Class:"+name);
			if(c2!=null &&c2!=Object.class) System.out.println("Extends "+c2.getName());
			System.out.print("\n{\n");
			printConstructors(c1);
			System.out.println();
			printMethods(c1);
			System.out.println();
			printFileds(c1);
			System.out.print("}");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}	
	}

	public static void printFileds(Class c1) {
		// TODO 自动生成的方法存根
		Field []fields=c1.getDeclaredFields();
		
		for(Field f:fields) {
			Class type=f.getType();
			String name=f.getName();
			System.out.print("  ");
			String modifiers=Modifier.toString(f.getModifiers());
			if(modifiers.length()>0)   System.out.print(modifiers+" ");
			System.out.println(type.getName()+" "+name+";");
		}
	}

	public  static void printMethods(Class c1) {
		Method[] methods=c1.getDeclaredMethods();
		for(Method m:methods) {
			Class retType=m.getReturnType();
			String name=m.getName();
			System.out.print("  ");
			//print modifiers,return type and method name
			String modifiers=Modifier.toString(m.getModifiers());
			if(modifiers.length() > 0) System.out.print(modifiers+" ");
			System.out.print(retType.getName()+" "+name+"(");
			Class []paramTypes=m.getParameterTypes();
			for(int j=0;j<paramTypes.length;j++) {
				if(j>0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
		
	}

	public static void printConstructors(Class c1) {
		Constructor[] constructors=c1.getDeclaredConstructors();
		for(Constructor c:constructors) {
			String name=c.getName();
			System.out.print("  ");
			String modifiers=Modifier.toString(c.getModifiers());
			System.out.print(name+"(");
			Class []paramTypes=c.getParameterTypes();
			for(int j=0;j<paramTypes.length;j++) {
				if(j>0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
		
	}
	

}
