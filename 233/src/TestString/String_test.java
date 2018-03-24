package TestString;

public class String_test {
 public static void main(String []args) {
	 char e='f';
	 String ChartoString=Character.toString(e);
	 System.out.println("ChartoString==\"f\"  :"+(ChartoString=="f"));  //false
	 System.out.println("\"f\".hashCode()  :"+"f".hashCode());
	 System.out.println("ChartoString.hashCode :"+ChartoString.hashCode());
	 String s1="abc";
	 String s2=new String ("abc");
	 System.out.println("s1==s2 "+(s1==s2));
	 System.out.println("s1.equals(s2) " +s1.equals(s2));
 }
}
