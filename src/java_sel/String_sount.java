package java_sel;

public class String_sount {

	public static void main(String[] args) {
		String[] names= {"deepika","nitin","aarav","mohit"};
		int count=0;
		for(int i=0;i<names.length;i++)
		{
			String name=names[i];
			for(int j=0;j<name.length();j++)
			{
				if(name.charAt(j)=='a'||name.charAt(j)=='e'||name.charAt(j)=='i'||name.charAt(j)=='o'||name.charAt(j)=='u')
				{
					count++;
				}
			}
			System.out.println(i+1+": name is **"+names[i]+"** total vovel is:  "+count);
			count=0;
		}

	}

}
