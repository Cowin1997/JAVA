package wintertest;

public class test01 {
	private test01 temp;
	private int No;
	private String name;
	public test01(String name,int no) {
		this.name=name;
		this.No=no;
	}
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void ShowInfo() {
		System.out.println("Name is "+name+" ,and No is "+No);
	}
	public void test(test01 t) {
		/*this.name=t.name;
		this.No=t.No;
		*/
		t.setName("23333");
		t.setNo(233333333);
	}
	public test01  ttttt(test01 t) {
		System.out.println(t);
		return t;
	}
	public static void main(String args[]) {
		test01 t1=new test01("first person",1001);
		test01 t2=new test01("secong person",1002);
		test01 t3=t1;
		t1.ShowInfo();
		t2.ShowInfo();
		t1.test(t2);
		System.out.println("t1.test(t2)");
		t1.ShowInfo();
		t2.ShowInfo();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t2==(t1.ttttt(t2)));
	     

	
	}
	

}
