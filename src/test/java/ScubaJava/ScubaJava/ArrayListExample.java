package ScubaJava.ScubaJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
//-------1
		List<String> list = new ArrayList();
		list.add("Rutukanta");
		list.add("NTA");
		list.add("FAB");
		list.add("SATHISH");
		list.add("Rutukanta");
		
		for (String name:list) {
			System.out.println(name);
			
		}
			System.out.println(list.get(3));
			System.out.println(list.size());
			System.out.println(list.remove(4));
			System.out.println(list.size());
			
			System.out.println(list.set(3, "Mani"));
			System.out.println(list);
//-------2		
			Iterator<String> itr = list.iterator();// eqaul to line no 10 to18
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
//-------3	for java 8		
//		list.forEach(System.out::println);
//		
//		list.stream().forEach(lists) -> System.out.println(lists);
System.out.println("-----------------------------------");
		
		Collections.sort(list);
		System.out.println(list);

System.out.println("-----------------------------------");		
		
		Collections.reverse(list);
		System.out.println(list);
		
System.out.println("-----------------------------------");		
		
//-------4
		




		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
