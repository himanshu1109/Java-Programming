
class Employee{
	int Salary;
	String name;
	int getSalary() {
		return Salary;
	}
	String getName() {
		return name;
	}
	String setName(String n) {
		name = n;
		return name;
	}
}

public class employeeClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.Salary = 45000;
		emp.name = "Himanshu";
		System.out.println(emp.Salary);
		System.out.println(emp.name);
		System.out.println(emp.getSalary());
		System.out.println(emp.getName());
		System.out.println(emp.setName("Himanshu Goyal"));
	}

}
