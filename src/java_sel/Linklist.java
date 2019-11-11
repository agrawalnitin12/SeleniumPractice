package java_sel;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Linklist   {

	public static void main(String[] args) {

List<Integer> list=new LinkedList<>();
list.add(10);
list.add(40);
list.add(30);
list.add(10);
list.add(10);
System.out.println(list);
System.out.println(list.get(1));
System.out.println(list.isEmpty());
System.out.println(list.indexOf(40));
System.out.println(list.lastIndexOf(list));
System.out.println(list.subList(1, 3));
System.out.println(list.size());

System.out.println(list.add(10));
System.out.println(list.size());
System.out.println(list);
System.out.println(list.remove(4));
//list.remove(2);
System.out.println(list);
list.add(10);
list.add(90);
list.add(70);
System.out.println(list);
list.set(1, 5);
System.out.println(list);
 System.out.println(list.addAll(list.size(), list));

 System.out.println(list);
 
	}

}
