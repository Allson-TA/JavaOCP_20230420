package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LottoMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<Set<Integer>>futureTask = new FutureTask<>(new Lotto());
		new Thread(futureTask).start();
		Set<Integer> nums = futureTask.get();
		System.out.println(nums);
		
		//	使用TreeSet排序內容
		Set<Integer> sortedNums = new TreeSet<>(nums);
		System.out.println(sortedNums);
		
		//	使用Collections.sort()
		List<Integer> sortedNums2 = new ArrayList<>(nums);
		Collections.sort(sortedNums2,Collections.reverseOrder());	//Collections.reverseOrder()反序的意思
		System.out.println(sortedNums2);
	}

}
