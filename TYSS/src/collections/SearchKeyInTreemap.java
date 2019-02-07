package collections;

import java.util.TreeMap;
import java.util.HashSet;
import java.util.Scanner;

public class SearchKeyInTreemap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1, "testng");
		tmap.put(2, "frame work");
		tmap.put(3, "GIT");
		tmap.put(4, "maveen");
		tmap.put(5, "jenkins");
		  if(tmap.containsKey(key)) {
			  System.out.println("Treemap contains the key: "+key);
		  }
		  else
			  System.out.println("Treemap does not contain the entered key");
		}

}
