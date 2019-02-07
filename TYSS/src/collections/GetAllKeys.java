package collections;

import java.util.HashMap;
import java.util.Scanner;

public class GetAllKeys {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "groups");
		hmap.put(2, "priority");
		hmap.put(3, "innvocation count");
		hmap.put(4, "data provider");
		hmap.put(5, "depends on method");
		System.out.println(hmap.keySet());

	}

}
