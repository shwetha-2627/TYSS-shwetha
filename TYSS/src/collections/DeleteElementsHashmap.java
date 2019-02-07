package collections;

import java.util.HashMap;

public class DeleteElementsHashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "keywords");
		hmap.put(2, "indentifiers");
		hmap.put(3, "literals");
		hmap.put(4, "separators");
		System.out.println("Before deleting Elements: "+hmap);
		hmap.clear();
		System.out.println("After deleting all Elements: "+hmap);
		

	}

}
