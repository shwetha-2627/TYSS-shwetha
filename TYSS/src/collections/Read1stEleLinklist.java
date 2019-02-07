package collections;

import java.util.Collections;
import java.util.LinkedList;

public class Read1stEleLinklist {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		link.add("static");
		link.add("non static");
		link.add("local");
		link.add("reference");
		Collections.sort(link);
		System.out.println(link.pollFirst());
	}
}
