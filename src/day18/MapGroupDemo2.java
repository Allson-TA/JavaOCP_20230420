package day18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 利用 Map 進行群組與分類 + 排序 (必考)
public class MapGroupDemo2 {
	
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList(
				"apple", "mango", "banana", "papaya", "orange",
				"apple", "mango", "apple", "apple", "orange",
				"pineapple", "banana", "mango"); 
		
		// 請問每一種水果各有幾個 ? 並且要依照數量由大到小排序
		// apple=4, mango=3, banana=2, orange=2, papaya=1, pineapple=1
		
		Map<String, Long> unsortedMap = fruits.stream()
				   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(unsortedMap); // 只有分類但尚未排序
		
		// 解法 1:
		Map<String, Long> sortedMap = new LinkedHashMap<>(); // 用來存放排序好的元素
		unsortedMap.entrySet()
				   .stream()
				   .sorted(Map.Entry.<String, Long>comparingByValue() // 根據 value 來排
						   .reversed()) // 反序
				   		   .forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue())); // 逐一將排好的元素放入到 sortedMap 集合中
		System.out.println(sortedMap);	// 有分類有排序
		
		// 解法 2:
		Map<String, Long> sortedMap2 = unsortedMap.entrySet()
												  .stream()
												  .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
												  .collect(Collectors.toMap(
														  Map.Entry::getKey, 
														  Map.Entry::getValue,
														  (oldEntry, newEntry) -> oldEntry, // 若元素有衝突時使用 oldValue
														  LinkedHashMap::new)); // 因為 toMap 預設是使用 HashMap 所以我們要改為 LinkedHashMap
		System.out.println(sortedMap2);
	}
	
}