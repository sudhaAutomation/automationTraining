package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Collectionss {

	public static void main(String[] args) {
		ArrayList<String> arlist = new ArrayList<String>();
		arlist.add("ramu");
		arlist.add("Somu");
		arlist.add("geetha");
		arlist.add("sudha");
		arlist.add("Somu");
		arlist.add("ramu");
		System.out.println(arlist);
		LinkedList<String> lklist = new LinkedList<String>();
		lklist.add("John");
		lklist.add("Stephen");
		lklist.add("auntony");
		lklist.add("Stephen");
		lklist.add("masur");
		System.out.println(lklist);
		arlist.remove(4);
		lklist.remove(3);
		System.out.println(arlist);
		System.out.println(lklist);
		System.out.println(arlist.addAll(lklist));
		System.out.println(arlist);
		System.out.println(arlist.removeAll(lklist));
		System.out.println(arlist);
		System.out.println(arlist.removeAll(lklist));
		HashSet<Integer> hash = new HashSet<Integer>();
		HashSet<Integer> hash2 = new HashSet<Integer>();
		hash.add(100);
		hash.add(100);
		hash.add(200);
		hash.add(300);
		hash.add(300);
		hash.add(400);
		hash2.add(500);
		System.out.println(hash.addAll(hash2));
		System.out.println(hash);
		HashMap<String, Object> map = new HashMap<>();
		map.put("padma", 123456);
		map.put("sudha", 123456);
		map.put("geetha", "geetha@123");
		map.put("swhizz", 123.456);
		map.put("sudha", "admin");
		map.put("padma123", 123456);
		map.put("padma", 123456);
		System.out.println(map);
		Iterator<Integer> it = hash.iterator();
		System.out.println(hash.size());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
	}

}
