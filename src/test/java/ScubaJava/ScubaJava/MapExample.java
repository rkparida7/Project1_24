package ScubaJava.ScubaJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();// Hashing allow null value
//		Map<Integer,String> map = new TreeMap();//Sorted not allowed null
//		Map<Integer,String> map = new LinkedHashMap();//Insertion Order 

		System.out.println("HashMap------>");

		map.put(4, "Maveric");
		map.put(3, "CTS");
		map.put(2, "Wipro");
		map.put(1, "CapeGemini");
		map.put(2, "Wipro");
//		        System.out.println(map);
//		        System.out.println(map.size());

		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();// eqaul to line no 10 to18
//		Iterator itr = map.keySet().iterator();// eqaul to line no 10 to18

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("******--------------********");
	}
}
