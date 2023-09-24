package day16;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		//	可修改集合
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(90);
		list.add(100);
		list.add(80);
		list.add(90);
		System.out.println(list);
		System.out.println(list.get(1));	//	得到index = 1 的元素
		list.remove(1);	//	移除index = 1 的元素
		System.out.println(list);
		//	index = 2 的內容由 80 修改成88
		list.set(2, 88);
		System.out.println(list);
		
	}

}
