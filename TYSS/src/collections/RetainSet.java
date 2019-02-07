package collections;

import java.util.HashSet;

public class RetainSet {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("overloading");
		hset.add("overriding");
		hset.add("derivedcasting");
		hset.add("is-a relation");
		System.out.println("1st set: "+hset);
		HashSet<String> hset1 = new HashSet<>();
		hset1.add("has-a relation");
		hset1.add("upcast");
		hset1.add("downcast");
		hset1.add("derivedcasting");
		hset1.add("is-a relation");
		System.out.println("2nd set: "+hset1);
		hset1.retainAll(hset);
		System.out.println("elements in both set: "+hset1);

	}

}
