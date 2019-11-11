package java_sel;

import java.util.Scanner;

public class Arm_series {

	public static void main(String[] args) {
		int r=0,arm=0,p=0,n1=0,i;

		String n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range of the series===>");
		int range=scan.nextInt();
		for( i=1;i<=range;i++)
		{
			//System.out.println("value of i  "+i);
			n=Integer.toString(i);
			p=n.length();
			n1=i;
			arm=0;
			//System.out.println(n1);

			while(n1!=0)
			{
				r=n1%10;
				n1=n1/10;
				arm=arm+power(r,p);		
			}
			//System.out.println(arm);
			if(arm==i)
			{
				System.out.println(arm);
			}

		}


	}

	public static int power(int r, int p) {
		int res=1;
		for( int pw=p;pw>=1;pw--) {
			res=res*r;
		}
		return res;
	}

}
