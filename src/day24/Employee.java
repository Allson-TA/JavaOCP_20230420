package day24;

public class Employee {
	private String name;
	private int salary;
	private String jobTitle;
	
	public Employee(String line) {
		String[] array = line.split(" ");
		this.name = array[0];
		this.salary = Integer.parseInt(array[1]);
		this.jobTitle = array[2];
	}
	
	public Employee(String name, int salary, String jobTitle) {
		this.name = name;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", jobTitle=" + jobTitle + "]";
	}
	
	
}