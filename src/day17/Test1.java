package day17;

import java.util.List;
import java.util.Set;
import static day17.DataCenter.getInstance;

public class Test1 {

	public static void main(String[] args) {
		// 取得所有職稱
		DataCenter dataCenter = getInstance();
		Set<Title> titles = dataCenter.getTitles();
		System.out.println(titles);
		// 取得所有員工
		List<Employee> employees = dataCenter.getEmployees();
		System.out.println(employees);
		// 請問經理(含)以上的平均薪資 ?
		double avg = employees.stream()
								.filter(emp -> emp.getTitle().getLevel() >= 4)
								.mapToLong(Employee::getSalary)
								.average()
								.getAsDouble();
		System.out.println(avg);
		
	}

}