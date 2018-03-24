package Test;

import java.util.Scanner;

public class Text_For {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("输入抽奖总个数");
		int n=in.nextInt();
		System.out.println("请输入抽出来的个数");
		int k=in.nextInt();
		double Probability=1;
		if(k>n)  System.out.println("输入错误！");
		for(int i=1;i<=k;i++) {
			Probability=Probability*1/(n-i+1);
		}
		in.close();
		System.out.println("你中奖的概率是"+Probability);
	}

}
