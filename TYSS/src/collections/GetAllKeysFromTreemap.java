package collections;

import java.util.TreeMap;

public class GetAllKeysFromTreemap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1, "groups");
		tmap.put(2, "priority");
		tmap.put(3, "innvocation count");
		tmap.put(4, "data provider");
		tmap.put(5, "depends on method");
		System.out.println(tmap.keySet());

	}

}
