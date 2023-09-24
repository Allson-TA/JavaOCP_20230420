package day22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Set<Integer>>{

	@Override
	public Set<Integer> call() throws Exception {
		//	得到1~39,不重複數字電腦選號5個
		Random random = new Random();
		Set<Integer> nums = new HashSet<>();
		while(nums.size()<5) {
			int num = random.nextInt(39)+1;
			nums.add(num);
		}
		
		return nums;
	}

}
