package collections;

import java.util.HashMap;

public class CopyOfHashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap =new HashMap<>();
		hmap.put(1, "POM");
		hmap.put(2, "Test");
		hmap.put(3, "generic");
		hmap.put(4, "script");
		hmap.put(5, "page");
		HashMap<Integer, String> hmap1 =new HashMap<>();
		System.out.println("Hasmap elements: "+hmap);
		hmap1.putAll(hmap);
		System.out.println("copy of Hashmap: "+hmap1);
		//System.out.println(LocalDate);

	}

}
