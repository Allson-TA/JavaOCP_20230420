package day21;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JobMain4 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		// 請利用5條執行緒分別算出每個元素的平方
		Set<Runnable> jobs = numbers.stream()
				.map(num -> (Runnable)()->System.out.println(num * num))
				.collect(Collectors.toSet());
		
		Set<Thread> threads = jobs.stream()
				.map(job -> new Thread(job))
				.collect(Collectors.toSet());
		
		threads.forEach(Thread::start);
		
		
	}
}