package Test;

import java.math.BigDecimal;

public class UseWhile {
	//输出1+1/2！+1/3！+...+1/n！
	public static void main(String []args) {
	int i=1;
	double sum1=0;
	double mult=1;
	while(i!=10) {
		sum1+=mult;
		i++;
		mult=mult*(1.0/i);	
	}//while
	System.out.println("result is:"+sum1);
	BigDecimal sum=new BigDecimal(0.0);
	BigDecimal multi=new BigDecimal(1.0);
	i=1;
	while(i!=10) {
		sum=sum.add(multi);
		++i;
		multi=multi.multiply(new BigDecimal(1.0/i));
	}
	System.out.println("result is:"+sum);
}//main
}//class
