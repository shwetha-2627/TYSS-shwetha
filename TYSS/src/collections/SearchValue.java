package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SearchValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		String value = sc.next();
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "suite");
		hmap.put(2, "test");
		hmap.put(3, "classes");
		hmap.put(4, "package");
		hmap.put(5, "parameter");
		  if(hmap.containsValue(value)) {
			  System.out.println("Hashmap contains value: "+value);
		  }
		  else
			  System.out.println("Hashmap does not contain the entered value");
		}
       
}
