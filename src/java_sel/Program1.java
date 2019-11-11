package java_sel;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		int []a= new int [] {1,2,3,4,3,2,1,4,5,3,2,5,6,7,6};
		ArrayList<Integer> b=new ArrayList <>();
		boolean f=false;
		//b.add(1);
		//System.out.println(b.size());
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=0;k<b.size();k++)
					{
						if(a[i] == b.get(k) )
						{
							f=true;
							break;
						}
					}
                        if(f)
                        {
                        	f=false;
                        	break;
                        }
                        b.add(a[i]);
					}
			}
		}
		System.out.println(b);
	}
}


