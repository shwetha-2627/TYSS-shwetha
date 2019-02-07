package collections;

import java.util.TreeSet;


public class FindDuplicateArray {

	public static void main(String[] args) {
		String[] arr= {"aa","bb","cc","aa","dd","bb"};
		TreeSet<String> unique = new TreeSet<>();
		for(String findds:arr) {
			if(!unique.add(findds)) {
				System.out.println(findds);
			}
		}
	}
}
