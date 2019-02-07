package collections;

import java.util.TreeMap;

public class Get1stKeyTreemap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(5, "Threads");
		tmap.put(3, "Exceptions");
		tmap.put(2, "Collections");
		tmap.put(4, "Oops");
		tmap.put(1, "Files");
		System.out.println(tmap);
		System.out.println(tmap.pollFirstEntry());

	}

}
