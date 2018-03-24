package Test;

public class JiuJiuMulti {
	public static void main(String []args) {
		final int x=9;
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j+"*"+i+"="+i*j+'\t');
			System.out.println();
	}
	}

}
