package java_sel;

import java.util.Scanner;

public class prime_series {

	public static void main(String[] args) {
		   
				Scanner scan=new Scanner(System.in);
				System.out.println("enter the range of prime number series:");
				int range=scan.nextInt();
				System.out.println("series is:");
				for(int n=1;n<=range;n++)
				{ int count =0;
					for(int d=n;d>=1;d--)
					{
						if(n%d==0)
						{
							count++;
						}
					}
					if (count==2)
					{
						System.out.println(n);
					}
				}

		//System.out.println("Enter the range");
		

	}

}
