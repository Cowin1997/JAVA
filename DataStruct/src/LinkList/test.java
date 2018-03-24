package LinkList;

public class test {
      static int a=1;
      static int b=0;
      public static void  f1(int x,int y)throws Exception {
    	  try {
    		  if(b==0) throw new ArithmeticException();
    	  }
    	  catch(ArithmeticException e) {
    		  System.out.println("Catch Exception!");
    		  throw e;
    	  }
    	  catch(Exception e) {
     		 e.printStackTrace();
     	 }
    	
    	 
    	  
      }
      public static void f2(){
    	 try {
    		 f1(a,b);
    	 }
    	 catch(ArithmeticException e) {
    		 System.out.println("触发异常");
    		 throw e;
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
    
    	//  System.out.println(a/b);
    	  System.out.println("程序正常结束");
      }
      public static void main(String[]args) {
    	 try { 
    		 f2();
    	 }
    	 catch(ArithmeticException e) {
    		 System.out.println("触发异常");
    		
    	 }
      }
}
