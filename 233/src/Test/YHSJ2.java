package Test;

public class YHSJ2 {
	public static void main(String []args) {
		int Y[][]=new int [10][];
		for(int i=0;i<10;i++) {
			Y[i]=new int [i+1];
		for(int j=0;j<=i;j++) {
			if(i==0||j==0||i==j)
				Y[i][j]=1;
			else {
				Y[i][j]=Y[i-1][j-1]+Y[i-1][j];
			}
		}
		}
		for(int []result:Y) {
			for(int e:result) 
				System.out.printf("%4d", e);
			System.out.println();
			
		}//for
	}//main

}//class
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