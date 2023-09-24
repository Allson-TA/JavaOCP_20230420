package day16;

import java.util.Arrays;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		//	不可變集合 	(可以查，可以修改)
		//	List<Integer> list = Arrays.asList(100,90,80);
		//	不可變集合 	(Immutable只可以查)
		List<Integer> list = List.of(100,90,80);	//	Java 9 支援List.of()
		System.out.println(list);
		System.out.println(list.get(1));
		//	list.set(1,99);
		//	System.out.println(list);
		//	list.add(70);	//	不可變集合不可增加元素
		//	list.remove(1);	//	不可變集合不可移除元素

	}

}
