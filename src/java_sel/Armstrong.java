package java_sel;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int r=0,arm=0,p=0,n1=0; 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number===>");

		try
		{
			
		String no=scan.nextLine();
		 p=no.length();
		 n1=Integer.parseInt(no);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter valid number only====>");
		
			String no=scan.nextLine();
			 p=no.length();
			 n1=Integer.parseInt(no);
		}
		int n=n1;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			arm=arm+pow(r,p);
				
		}
		System.out.println(arm);
		if(arm==n1)
		{
			System.out.println("Given no. is armstrong no.");
		}
		else
		{
			System.out.println("Given no. is not a armstrong no.");
		}
	}

	private static int pow(int r, int p) {
		int res=1;
		for( int pw=p;pw>=1;pw--) {
		 res=res*r;
		}
		return res;
	}

}
