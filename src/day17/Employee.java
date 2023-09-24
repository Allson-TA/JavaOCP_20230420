package day17;

//	員工

public class Employee {
	
	private String name;	//	員工姓名
	private Long salary;	//	員工薪資
	private Title title;	//	職稱
	
	public Employee() {
		
	}
	
	public Employee(String name,Long salary,Title title) {
		this.name = name;
		this.salary = salary;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", title=" + title + "]";
	}
	
	
}
