package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArraylist {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("pass");
		al.add("fail");
		al.add("skip");
		al.add("error");
		al.add("exception");
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println("Shuffled arraylist: "+al);
		
	}

}
