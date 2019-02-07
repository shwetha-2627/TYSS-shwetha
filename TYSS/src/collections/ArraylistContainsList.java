package collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistContainsList {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	     ArrayList<String> al = new ArrayList<>();
	     al.add("prema");
	     al.add("shreyank");
	     al.add("girish");
	     al.add("savitha");
	     al.add("shwetha");
	     List<String> list = new ArrayList<String>();
	     list.add("prema");
	     list.add("shreyank");
	     System.out.println(al.containsAll(list));
	     list.add("sweet");
	     System.out.println(al.contains(list));
	}

}
