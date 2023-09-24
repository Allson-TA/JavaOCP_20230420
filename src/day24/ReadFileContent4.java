package day24;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.joining;

import static java.util.Comparator.comparingInt;

public class ReadFileContent4 {
	public static void main(String[] args) throws IOException {
		// Lab 1: 請計算 employee.txt 每種職位的平均薪資
		
		// 1.需要建立 Employee 物件(name, salary, jobTitle)
		List<String> lines = Util.getLines("src/day24/employee.txt");
		System.out.println(lines);
		
		// 2.將 List<String> 轉 List<Employee>
		List<Employee> employees = lines.stream()
				.map(Employee::new)
				//.map(line -> new Employee(line))
				.collect(toList());
		System.out.println(employees);
		
		// 3.計算 employee.txt 每種職位的平均薪資
		Map<String, Double> avgSalaryByJobTitle = employees.stream()
				.collect(groupingBy(Employee::getJobTitle, averagingInt(Employee::getSalary)));
		System.out.println(avgSalaryByJobTitle);
		
		// Lab 2: 請計算 employee.txt 每種職位的人數
		Map<String, Long> countByJobTitle = employees.stream()
				.collect(groupingBy(Employee::getJobTitle, counting()));
		System.out.println(countByJobTitle);
		
		// Lab 3: 請計算 employee.txt 每種職位的中薪資最高的員工
		Map<String, Optional<Employee>> maxSalaryByJobTitle = employees.stream()
				.collect(groupingBy(Employee::getJobTitle, maxBy(comparingInt(Employee::getSalary))));
		System.out.println(maxSalaryByJobTitle);
		
		// Lab 4: 請計算 employee.txt 每種職位的員工名字有哪些
		Map<String, List<String>> namesByJobTitle = employees.stream()
				.collect(groupingBy(Employee::getJobTitle, mapping(Employee::getName, toList())));
		System.out.println(namesByJobTitle);
		
		// Lab 5: 請計算 employee.txt 中在平均薪資以上的員工與平均薪資以下的員工
		double averageSalary = employees.stream().mapToInt(Employee::getSalary).average().orElse(0);
		System.out.println("平均薪資:" + averageSalary);
		// true: 平均薪資以上的員工, false: 平均薪資以下的員工
		Map<Boolean, List<Employee>> bySalary = employees.stream()
				.collect(groupingBy(emp -> emp.getSalary() > averageSalary));
		System.out.println(bySalary);
		
		List<Employee> aboveAverage = bySalary.get(true);
		List<Employee> belowOrEqualAverage = bySalary.get(false);
		System.out.println("平均薪資以上的員工:" + aboveAverage);
		System.out.println("平均薪資以下的員工:" + belowOrEqualAverage);
		
		String aboveAverageNames = aboveAverage.stream().map(Employee::getName).collect(joining(", "));
		String belowOrEqualAverageNames = belowOrEqualAverage.stream().map(Employee::getName).collect(joining(", "));
		System.out.println("平均薪資以上的員工名字:" + aboveAverageNames);
		System.out.println("平均薪資以下的員工名字:" + belowOrEqualAverageNames);
	}
}