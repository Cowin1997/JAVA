
package Test;

public class Test_For_Each {
	public static void main(String[] args) {
		int []a=new int [10];
		for(int i=0;i<10;i++) {
			a[i]=i;
		}
		
		for(int elem:a) {
			System.out.println(elem);
		}
		System.out.println("*******************");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
