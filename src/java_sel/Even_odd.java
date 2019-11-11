package java_sel;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		   
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter any number");
				int number=scan.nextInt();
				if(number%2==0)
				{
					System.out.println(number+" is a Even number");
				}
				else
				{
					System.out.println(number+" is a Odd number");

				}

	}

}
