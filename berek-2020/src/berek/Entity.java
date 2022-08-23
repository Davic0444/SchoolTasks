package berek;

public class Entity {
	
	private String name;
	private String gender;
	private String department;
	private Integer entry;
	private Integer salary;
	
	public Entity(String name, String gender, String department, Integer entry, Integer salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.entry = entry;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public Integer getEntry() {
		return entry;
	}

	public Integer getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Entity [name=" + name + ", gender=" + gender + ", department=" + department + ", entry=" + entry
				+ ", salary=" + salary + "]";
	}
	
	
	
}
