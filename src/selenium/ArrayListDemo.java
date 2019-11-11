package selenium;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> emp = new ArrayList<>();
		emp.add("nitin");
		emp.add("agrawal");
		emp.add("satish");
		emp.add("kumar");
		System.out.println(emp.size());
		
		System.out.println(emp.get(0));
		
		for (String obj : emp) {
			System.out.println(obj);
		}

	}

}
