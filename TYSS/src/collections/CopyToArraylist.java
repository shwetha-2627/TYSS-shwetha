package collections;

import java.util.ArrayList;

public class CopyToArraylist {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("prema");
		al.add("shreyank");
		al.add("girish");
		al.add("savitha");
		al.add("shwetha");
		ArrayList<String> copy = (ArrayList<String>)al.clone();
		System.out.println(copy);

	}

}
