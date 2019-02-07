package collections;

import java.util.HashSet;

public class CopyOfHashset {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("overloading");
		hset.add("overriding");
		hset.add("derivedcasting");
		hset.add("is-a relation");
		HashSet<String> hset1 = new HashSet<>(hset);
		System.out.println(hset1);
		hset1.retainAll(hset);
		System.out.println(hset1);

	}

}
