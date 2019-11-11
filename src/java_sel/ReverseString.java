package java_sel;

public class ReverseString {

	public static void main(String[] args)
	{
		String str="i love my india";
		String []s=str.split(" ");
		for (int i=s.length-1;i>=0;i--)
		{
		System.out.print(s[i]);
		System.out.print(" ");
		}
	}

}
