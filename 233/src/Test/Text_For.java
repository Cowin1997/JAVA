package Test;

import java.util.Scanner;

public class Text_For {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("����齱�ܸ���");
		int n=in.nextInt();
		System.out.println("�����������ĸ���");
		int k=in.nextInt();
		double Probability=1;
		if(k>n)  System.out.println("�������");
		for(int i=1;i<=k;i++) {
			Probability=Probability*1/(n-i+1);
		}
		in.close();
		System.out.println("���н��ĸ�����"+Probability);
	}

}
