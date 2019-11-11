package java_sel;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any name");
		String name=scan.nextLine();
		int l=name.length();
		l--;
		for(int i=0;i<l;i++)
		{
			if(name.charAt(i)!=name.charAt(l-i))
				{
				flag=false;
				break;
				}
		
	}
	if(flag)
	{
	System.out.println("Given name is a palindorm");	
	}
	else
	{
		System.out.println("Given name is not a palindrom");
	}

}
}