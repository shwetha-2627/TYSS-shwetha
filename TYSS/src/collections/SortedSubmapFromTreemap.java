package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedSubmapFromTreemap {

	public static void main(String[] args) {
		SortedMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(3, "list");
		tmap.put(2,"set");
		tmap.put(1,"map");
		tmap.put(4,"queue");
		System.out.println(tmap);
		System.out.println(tmap.subMap(1, 4));
        
	}

}
