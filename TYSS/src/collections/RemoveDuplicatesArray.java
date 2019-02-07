package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		String[] arr= {"aa","bb","cc","aa","dd","bb"};
		System.out.println("Befor removing duplicates: "+Arrays.toString(arr));
		List<String> list = Arrays.asList(arr);
		Set<String> set = new HashSet<>(list);
		String[] arr1 =new String[set.size()];
		set.toArray(arr1);
		System.out.println("After removing duplicates: "+Arrays.toString(arr1));
	}
}
