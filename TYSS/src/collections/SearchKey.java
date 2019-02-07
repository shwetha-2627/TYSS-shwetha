package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SearchKey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "testng");
		hmap.put(2, "frame work");
		hmap.put(3, "GIT");
		hmap.put(4, "maveen");
		hmap.put(5, "jenkins");
		  if(hmap.containsKey(key)) {
			  System.out.println("Hashmap contains the key: "+key);
		  }
		  else
			  System.out.println("Hashmap does not contain the entered key");
		}

}
