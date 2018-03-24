package Test;

public class Changeable_Arrary {
	public static void main(String[]args) {
		final int MAX=10;
		int[][]YangHuiSanJiao=new int[MAX][];
		for(int i=0;i<MAX;i++) {
			YangHuiSanJiao[i]=new int [i+1];
		}
		for(int i=0;i<YangHuiSanJiao.length;i++)
			for(int j=0;j<YangHuiSanJiao[i].length;j++) {
			  int result=1;
			  for(int k=1;k<=j;k++) 
				 result=result*(i-k+1)/k;
			  YangHuiSanJiao[i][j]=result;
			}
		System.out.println("杨辉三角是：");
		for(int[]elem:YangHuiSanJiao)
		{	for(int Elem:elem)
				System.out.printf("%4d",Elem);
				System.out.println();
		}
				
	}//end of main

}//end of class
/*
杨辉三角是：
1
1   1
1   2   1
1   3   3   1
1   4   6   4   1
1   5  10  10   5   1
1   6  15  20  15   6   1
1   7  21  35  35  21   7   1
1   8  28  56  70  56  28   8   1
1   9  36  84 126 126  84  36   9   1
*/
/*
1
1   1
1   2   1
1   3   3   1
1   4   6   4   1
1   5  10  10   5   1
1   6  15  20  15   6   1
1   7  21  35  35  21   7   1
1   8  28  56  70  56  28   8   1
1   9  36  84 126 126  84  36   9   1
*/