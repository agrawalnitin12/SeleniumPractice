package java_sel;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to check whether it prime or not:");
		int num=scan.nextInt();
		
		//for(int n=1;n<=range;n++)
		//{ 
			int count =0;
			for(int d=num;d>=1;d--)
			{
				if(num%d==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println("Given number "+num+" is a prime number ");
			}
			else {
				System.out.println("Given number "+num+" is a non prime number ");
		}



	}

}
