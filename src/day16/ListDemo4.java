package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


public class ListDemo4 {

	public static void main(String[] args) {
		List<Integer> poker = new ArrayList<>();
		
		IntStream.rangeClosed(1, 13).forEach(i->poker.add(i));
				
		System.out.println(poker);
		
		//	請打亂元素(洗牌)
		
		Random r = new Random();
		for(int count = 1; count<=100;count++) {
			
			int idx1 = r.nextInt(poker.size());
			int idx2 = r.nextInt(poker.size());
			int card1 = poker.get(idx1);
			int card2 = poker.get(idx2);
			poker.set(idx1, card2);
			poker.set(idx2, card1);
		}
		System.out.println(poker);
		
		//	請打亂元素(洗牌) - 使用 Collections.shuffle()
		Collections.shuffle(poker);
		System.out.println(poker);
	}

}
