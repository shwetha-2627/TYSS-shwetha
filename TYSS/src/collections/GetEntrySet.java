package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class GetEntrySet {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "jdk");
		hmap.put(2, "jvm");
		hmap.put(3, "class loader");
		hmap.put(4, "jit");
		hmap.put(5, "interpreter");
		System.out.println("The Entry Set is:");
		Set<Entry<Integer,String>> ent = hmap.entrySet();
		for(Entry<Integer,String> e:ent) { 
        System.out.println(e.getKey()+" = "+e.getValue());
		}
	}

}
