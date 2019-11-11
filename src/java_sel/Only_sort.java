package java_sel;

public class Only_sort {

	public static void main(String[] args) {
		int []a= {5,4,6,1,2,3,2,2,1};
		int key ,temp;

		for(int i=0;i<a.length;i++)
		{
			key=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(key>a[j])
				{
					temp=key;
					key=a[j];
					a[j]=temp;
				}
			}
			a[i]=key;
		}
		

		System.out.println(a);
	

	}

}
