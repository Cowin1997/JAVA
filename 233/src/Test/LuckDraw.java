package Test;

import java.util.Arrays;
import java.util.Scanner;


public class LuckDraw {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("������齱����������");
	int DrawSum=in.nextInt();//6
	System.out.println("��������������");
	int OutDraw=in.nextInt();//6
	int []Draw_Sum=new int [DrawSum];
	int []Out_Draw=new int [OutDraw];
	for(int i=0;i<DrawSum;i++) {
		Draw_Sum[i]=i+1;
	}
	
	for(int k=0;k<OutDraw;k++) {
		int result=(int)(Math.random()*DrawSum);//0-5
		Out_Draw[k]=Draw_Sum[result];
		Draw_Sum[result]=Draw_Sum[DrawSum-1];
		DrawSum--;
	}
	System.out.println("�齱�أ�");
	for(int elem:Draw_Sum)
		System.out.print(elem+" ");
	System.out.println("�齱�����");
	Arrays.sort(Out_Draw);
	for(int Elem:Out_Draw)
		System.out.print(Elem+" ");
	in.close();
}
}