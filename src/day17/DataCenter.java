package day17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

// 資料中心(SingleTon 單例模式)
// 定義預設的職稱與員工
public class DataCenter {
	private static DataCenter _instance = new DataCenter();
	
	private Set<Title> titles = new LinkedHashSet<>();
	private List<Employee> employees = new ArrayList<>();
	
	private DataCenter() {
		titles.add(new Title(1, "專員"));
		titles.add(new Title(2, "襄理"));
		titles.add(new Title(3, "副理"));
		titles.add(new Title(4, "經理"));
		titles.add(new Title(5, "協理"));
		titles.add(new Title(6, "副總"));
		
		employees.add(new Employee("John",  40000L,  getTitle(1)));
		employees.add(new Employee("Mary",  50000L,  getTitle(2)));
		employees.add(new Employee("Bob",   60000L,  getTitle(3)));
		employees.add(new Employee("Jack",  70000L,  getTitle(4)));
		employees.add(new Employee("Rose",  80000L,  getTitle(4)));
		employees.add(new Employee("Helen", 90000L,  getTitle(5)));
		employees.add(new Employee("Micro", 45000L,  getTitle(1)));
		employees.add(new Employee("Mark",  55000L,  getTitle(2)));
		employees.add(new Employee("James", 65000L,  getTitle(3)));
		employees.add(new Employee("Anita", 120000L, getTitle(6)));
	}
	
	public Title getTitle(Integer level) {
		 /*
		 Optional<Title> titleOpt = titles.stream()
				     					  .filter(title -> title.getLevel().equals(level))
				     					  .findFirst();
		 return titleOpt.isPresent() ? titleOpt.get() : null;
		 */
		
		return titles.stream()
				  .filter(title -> title.getLevel().equals(level))
				  .findFirst()
				  .orElseGet(null);
		
	}
	
	public static DataCenter getInstance() {
		return _instance;
	}
	
	public Set<Title> getTitles() {
		return titles;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
}