package Test;
import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Text_In_Out{
	public static void main(String[] args)throws IOException//���߱���������
	 {                                                      //�����쳣�����Ҳ�����ַ��
		
		Scanner In=new Scanner(Paths.get("D:\\Javamydir\\myfile.txt"));
		System.out.println(In.next());
		In.close();
		PrintWriter out=new PrintWriter("myfile.txt");
		out.println("д��ɹ���");
		out.close();//d
		Scanner in=new Scanner("sssss ffff fffs  ff");
		System.out.println(in.nextLine());
		in.close();
	}

}
