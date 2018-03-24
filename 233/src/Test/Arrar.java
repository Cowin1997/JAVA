package Test;

import java.util.Scanner;

public class Arrar {
	public static void main(String[]args) {
		int []arr=new int [10];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<10;i++)
			arr[i]=in.nextInt();
		for(int e:arr)
			System.out.print(e+" , ");
		System.out.println();
	
	for(int i=1;i<10;i++)
		for(int j=0;j<10-i;j++) 
			if(arr[j]>arr[j+1]){
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
	for(int e:arr)
		System.out.print(e+" , ");
			}
				
		

}
