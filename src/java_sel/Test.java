package java_sel;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		int temp = 1;
		int arr[] = { 4, 2, 5, 9, 6, 2, 4, 8, 55, 7, 998, 34, 6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp++;
				}
			}
			System.out.println("The Element is: "+arr[i]+"   & occurence is:  "+temp);
			temp = 1;
		}

	}

}
