package collections;

import java.util.LinkedList;
import java.util.List;

public class SublistFromLinkedlist {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("typecast");
		list.add("upcast");
		list.add("downcast");
		list.add("widening");
		list.add("narrowing");
		System.out.println("linked list: "+list);
		List<String> sub = list.subList(1, 4);
        System.out.println("sublist: "+sub);
	}

}
