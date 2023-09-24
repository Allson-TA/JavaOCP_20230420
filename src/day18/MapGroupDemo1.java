package day18;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

// 利用 Map 進行群組與分類 (必考)
public class MapGroupDemo1 {
	
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList(
				"apple", "mango", "banana", "papaya", "orange",
				"apple", "mango", "apple", "apple", "orange",
				"pineapple", "banana", "mango"); 
		
		// 請問每一種水果各有幾個 ?
		// apple=4, mango=3, banana=2, orange=2, papaya=1, pineapple=1
		
		// 解法 1:
		Map<String, Long> map = new LinkedHashMap<>(); // 存放 "水果=出現次數" 的集合
		Set<String> fruitKeys = new LinkedHashSet<>(fruits); // 取得所有水果名(不重複)
		for(String key : fruitKeys) {
			// 找到特定元素在 list 中出現的次數
			long value = Collections.frequency(fruits, key);
			//System.out.printf("%s=%d\n", key, value);
			map.put(key, value);
		}
		System.out.println(map);
		
		// 解法 2: 進行群組與分類
		Map<String, Long> map2 = fruits.stream()
									   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map2);
		
	}
	
}