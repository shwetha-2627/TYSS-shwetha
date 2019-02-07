package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingInArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("thread.sleep");
		al.add("implicitwait");
		al.add("explicitwait");
		al.add("customwait");
		al.add("fluentwait");
		System.out.println("Before swapping: "+al);
		Collections.swap(al, 3, 0);
		System.out.println("After swapping: "+al);

	}

}
