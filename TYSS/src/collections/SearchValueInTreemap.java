package collections;

import java.util.TreeMap;
import java.util.Scanner;

public class SearchValueInTreemap {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		String value = sc.next();
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1, "suite");
		tmap.put(2, "test");
		tmap.put(3, "classes");
		tmap.put(4, "package");
		tmap.put(5, "parameter");
		  if(tmap.containsValue(value)) {
			  System.out.println("Treemap contains value: "+value);
		  }
		  else
			  System.out.println("Treemap does not contain the entered value");
		}
       
}
