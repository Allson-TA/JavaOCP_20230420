package day10;

import java.util.Arrays;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Supervisor supervisor = new Supervisor();
		
		Employee emp = manager;
		System.out.println(emp.salary);
		
		if(emp instanceof Manager) { // emp 所指向的是否是 Manager 的實例
			System.out.println(((Manager)emp).budget);
		}
		
		if(emp instanceof Supervisor) { // emp 所指向的是否是 Supervisor 的實例
			System.out.println(((Supervisor)emp).stockOptions);
		}
		
		Employee[] employees = {employee, manager, supervisor};
		System.out.printf("員工人數: %d\n", employees.length);
		
		// 設問這 3 個員工的 salary + budget + stockoptions 的總和為何 ?
		
		int sum = Arrays.stream(employees)
						.mapToInt(e -> {
							int total = e.salary;
							if(e instanceof Manager) {
								total += ((Manager) e).budget;
								if(e instanceof Supervisor) {
									total += ((Supervisor) e).stockOptions;
								}
							}
							return total;
						})
						.sum();
		System.out.println(sum);
		
		sum = 0;
		for(Employee e : employees) {
			int total = e.salary;
			if(e instanceof Manager) {
				total += ((Manager) e).budget;
				if(e instanceof Supervisor) {
					total += ((Supervisor) e).stockOptions;
				}
			}
			sum += total;
		}
		System.out.println(sum);
	}

}