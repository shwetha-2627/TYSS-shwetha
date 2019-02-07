package collections;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ReverseSortedInTreemap {

	public static void main(String[] args) {
		Map<Integer, String> tmap = new TreeMap<>(Collections.reverseOrder());
		tmap.put(5, "Threads");
		tmap.put(3, "Exceptions");
		tmap.put(2, "Collections");
		tmap.put(4, "Oops");
		tmap.put(1, "Files");
		System.out.println(tmap);

	}

}
