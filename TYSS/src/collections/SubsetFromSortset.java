package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SubsetFromSortset {

	public static void main(String[] args) {
		SortedSet<String> tset = new TreeSet<>();
		tset.add("list");
		tset.add("set");
		tset.add("map");
		tset.add("queue");
		System.out.println(tset);
		System.out.println(tset.subSet("list", "set"));
        
	}

}
