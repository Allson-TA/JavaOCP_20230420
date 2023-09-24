package day15;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SetDemo3 {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10)
					.forEach(System.out::println);

		//	轉 Set<Integer>
		Set<Integer> set = IntStream.rangeClosed(1, 10)	//	int stream
									.boxed()	//	Integer stream
									.collect(Collectors.toSet());	//	收集給set
		System.out.println(set);
	}

}
