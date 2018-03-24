package Test;

//import java.util.Scanner;

public class Text_Array {
	public static void main(String[]args) {
		final int STARTRATE=10;
		final int NRATES=6;
		final int NYEARS=6;
		double[]Rate=new double[NRATES];//利率
		for(int k=0;k<Rate.length;k++) {
			Rate[k]=(STARTRATE+k)/100.0;
		}
		double [][]balances=new double [NRATES][NYEARS];
		for(int i=0;i<balances[0].length;i++)
			balances[0][i]=10000;
		for(int i=1;i<balances.length;i++)
			for(int j=0;j<balances[i].length;j++) {
			//double increase=balances[i-1][j]*Rate[j];
	    	//balances[i][j]=increase+balances[i-1][j];
				balances[i][j]=balances[i-1][j]+balances[i-1][j]*Rate[j];	
			}
		for(int i=0;i<Rate.length;i++)
			System.out.printf("%9.0f%%",100*Rate[i]);
		System.out.println();
		System.out.println("                                                                输出结果：");
		for(double[] row:balances) {
			for(double b:row)
				System.out.printf("%10.2f",b);
			
			    System.out.println();
		}
			
		
	}

}
