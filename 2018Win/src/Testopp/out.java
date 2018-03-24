package Testopp;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class out {
	//重新定向输出流   把原来输出到控制台的信息输出到 .txt文件
	public static void main (String []args) {
	try
	{	PrintStream  out=System.out;
		PrintStream  ps=new PrintStream("./log.txt");
		System.out.println("Now look at this out!");
		System.setOut(ps);
		System.out.println("first,,write to file!");
		System.out.println("second,,write to file!");
		System.setOut(out);
		System.out.println("write over!");
	}
	
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}

}
} 
