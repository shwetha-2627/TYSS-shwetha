package collections;

import java.util.LinkedList;

public class CopyLinkToArray {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		link.add("encapsulation");
		link.add("inheritance");
		link.add("polymorphism");
		link.add("abstraction");
		link.add("interface");
		System.out.println("linked list : "+link);
		String[] arr = new String[link.size()];
	    link.toArray(arr);
	    for(String s:arr) {
	    	System.out.println("array : "+s);
	    }

	}

}
