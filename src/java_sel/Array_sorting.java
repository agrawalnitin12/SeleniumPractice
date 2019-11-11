package java_sel;

import java.util.Arrays;

public class Array_sorting {

	public static void main(String[] args) {
	int []arr= {1,1,2,1,2,1,2,1,2,1,2,2};
	int key;
	int group=0;
	if(arr.length!=0)
		group++;
	
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	key=arr[0];
	for(int i=0;i<arr.length;i++)
{
		if(arr[i]!=key)
		{
group++;
key=arr[i];
	
}
}
System.out.println("no. of groups ="+group);
	}

	

}
