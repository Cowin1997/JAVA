package TestInterface;

public class TestInnerClass {
	public static void main(String []args) {
		TestInnerClass a=new TestInnerClass("OutCawdawdadlass");
	//	a.PrintOut();
		TestInnerClass.InnerClass in=a.new InnerClass("InnerClahdsdgjss!");
		in.PrintInner();
		
	}
	private String OutName;
	public void PrintOut() {
		System.out.println(OutName);
	
	//	inner.PrintInner();
	}
	public TestInnerClass(String name) {
		OutName=name;
	}
	public class InnerClass{
		public  String InnerName;
		public void PrintInner() {
			System.out.println(InnerName);
			System.out.println(TestInnerClass.this.OutName);
		}
		public InnerClass(String InnerName) {
			this.InnerName=InnerName;
		}
	}

}
