package java_sel;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		int pre1=0;
	    int pre2=1;
	    int series;
	    
		Scanner scan=new Scanner(System.in);
		System.out.println("enter range of series");
		int range=scan.nextInt();
		System.out.println("the fabonacci series is");
		for(int i=1;i<=range;i++)
		{
		
			series=pre1+pre2;
			pre1=pre2;
			pre2=series;
			System.out.println(series);
			
		}
		
	}
}
