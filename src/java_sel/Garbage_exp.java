package java_sel;

public class  Garbage_exp{
public void finalize()
{
System.out.println("in finalize method ");	
}
	public static void main(String[] args) {
		Garbage_exp gar=new Garbage_exp();
		Garbage_exp gar1 =new Garbage_exp();
		gar=null;
		gar1=null;
		System.out.println(gar);
	  //  System.gc();
		System.out.println("garbage collctor");
		System.out.println(gar+","+ gar1);
		
		
	}

}
