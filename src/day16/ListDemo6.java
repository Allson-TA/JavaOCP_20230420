package day16;

import java.util.ArrayList;
import java.util.Set;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;


public class ListDemo6 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
		
		Set<Integer> ans = new LinkedHashSet<>(list);

		System.out.println(ans);
	}
}
