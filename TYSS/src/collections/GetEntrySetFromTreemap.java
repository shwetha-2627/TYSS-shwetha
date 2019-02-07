package collections;

import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

public class GetEntrySetFromTreemap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1, "jdk");
		tmap.put(2, "jvm");
		tmap.put(3, "class loader");
		tmap.put(4, "jit");
		tmap.put(5, "interpreter");
		System.out.println("The Entry Set is:");
		Set<Entry<Integer,String>> ent = tmap.entrySet();
		for(Entry<Integer,String> e:ent) { 
        System.out.println(e.getKey()+" = "+e.getValue());
		}
	}

}
