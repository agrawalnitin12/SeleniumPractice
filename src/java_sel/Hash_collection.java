package java_sel;

import java.util.HashMap;

public class Hash_collection {

	public static void main(String[] args) {
		HashMap h= new HashMap();
		HashMap h1= new HashMap();

		h.put(1,"nitin");
		h.put(2, "deepa");
		h.put(3, "aarav");
		System.out.println("h map************");
		System.out.println(h);
		h1.put("a","mohit");
		h1.put("b", "saurabh");
		h1.put("c", "himani");
		System.out.println("h1 map************");

		System.out.println(h1);
		h1.putAll(h);
		System.out.println(" aftar putall : h map************");

		System.out.println(h1);
h1.replace(1, 2);
System.out.println(" after replace: h map************");

System.out.println(h1);
System.out.println(" after clone: h map************");

 System.out.println(h1.clone());
 System.out.println(" after putIfAbsent: h map************for rohan");
 System.out.println(h1.putIfAbsent(4, "rohan"));
 

 System.out.println(h1);
 System.out.println(" after putIfAbsent: h map************for deepa");
 System.out.println(h1.putIfAbsent(2, "deepa"));
 System.out.println(h1);
 System.out.println(h1.keySet());
 System.out.println(h1.hashCode());
 
 
 
	}
 
}
