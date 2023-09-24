package day24;

import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.List;


public class ReadFileContent3 {

	public static void main(String[] args) throws IOException {
		// 請計算 age.txt 的平均年齡, 最大與最小年齡 ?
		List<String> lines = Util.getLines("src/day24/age.txt");
		IntSummaryStatistics stat = lines.stream().mapToInt(Util::getValue).summaryStatistics();
		System.out.printf("平均年齡: %.1f, 最大: %d 最小: %d\n", stat.getAverage(), stat.getMax(), stat.getMin());
	}

}