package java_sel;

public class Swap {


	public static void main(String[] args) {
		int a=10,b=20;
System.out.println("before swapping***  "+a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping***  "+a+","+b);
		String s1="abc" ,s2="def";
		System.out.println("before string swapping***  "+s1+","+s2);
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After string swapping***  "+s1+","+s2);
				
	}

}
