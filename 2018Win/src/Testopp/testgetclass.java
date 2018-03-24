package Testopp;

public class testgetclass {
	private class employee {
	}
	public testgetclass() {};	
	
	public static void main(String args[]) {
		
		testgetclass t=new testgetclass();
		employee e=t.new employee();
		System.out.println(t.getClass());
		System.out.println(e.getClass());
		System.out.println(t.toString());
		System.out.println(e.toString());
		
		String s1="OK";
		System.out.println("S1的HashCode:"+s1.hashCode());//HashCode 相等，hashcode根据字符
		String s2=s1;
		System.out.println("S2的HashCode:"+s2.hashCode());
		System.out.println("S1 ? S3:"+(s1==s2));//true
		String s3=new String("OK");//hashcode=s1的hashcode
		System.out.println("S3的HashCode:"+s3.hashCode());
		System.out.println("S1 ? S3:"+(s1==s3));//return false; 内存地址不一样
		System.out.println(s1.equals(s2));//String类的equals被重写，内存地址相同或则值相同就返回true
		
		
	}

}
