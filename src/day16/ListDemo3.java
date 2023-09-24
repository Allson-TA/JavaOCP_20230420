package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);	//	Integer.valueOf(3)
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		//	將可變集合轉為不可修改集合
		//	list = Collections.unmodifiableList(list);
		
		
		//	list.remove(3);	//	刪除index3 -->[1, 2, 3, 5]
		
		list.remove(Integer.valueOf(3));	//	刪除元素內容3 -->[1, 2, 4, 5]
		System.out.println(list);
		
		System.out.println(Collections.max(list));
	}

}
