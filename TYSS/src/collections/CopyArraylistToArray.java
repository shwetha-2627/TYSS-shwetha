package collections;

import java.util.ArrayList;

public class CopyArraylistToArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("pass");
		al.add("fail");
		al.add("skip");
		al.add("error");
		al.add("exception");
	    Object[] arr = al.toArray();
	    for(int i=0;i<arr.length;i++) {
	    System.out.println(arr[i]);
	    }
	}

}
