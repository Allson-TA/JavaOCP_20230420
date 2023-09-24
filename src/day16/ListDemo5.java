package day16;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class ListDemo5 {
	public static void main(String[] args) {
		//	隨機生成 4 個不重複的數字，範圍1~9
		Random r = new Random();
		Set<Integer> nums = new LinkedHashSet<>();
		while(nums.size() < 4) {
			nums.add(r.nextInt(9) + 1);
		}
		System.out.println(nums);
		//	將 Set 轉 List
		List<Integer>ans = new ArrayList<>(nums);
		System.out.println(ans);
		
		System.out.println(ans.get(0));
		System.out.println(ans.get(1));
		System.out.println(ans.get(2));
		System.out.println(ans.get(3));
		
		
	}
}
