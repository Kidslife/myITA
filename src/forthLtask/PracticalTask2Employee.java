package forthLtask;

import java.util.Comparator;
import java.util.List;



public class PracticalTask2Employee {
	private String name;
	private int departmentNumber;
	private Double salary;

	public PracticalTask2Employee(String name, int departmentNumber, double salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean containsNumber(List<PracticalTask2Employee> list, int dep) {
		PracticalTask2Employee object = new PracticalTask2Employee(name, departmentNumber, salary);
		if (object.getDepartmentNumber() == dep) {
			System.out.println(object.toString());
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return "PracticalTask2Employee [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary
				+ "]";
	}

	
	public static class CompareSalary implements Comparator <PracticalTask2Employee> {
		public final static CompareSalary s = new CompareSalary();
			
		@Override
		public int compare(PracticalTask2Employee emp1, PracticalTask2Employee emp2) {
			
			return emp2.salary.compareTo(emp1.salary) ;
		}

		
	}
   

	public String LandK() {
		String L = null;
		String K = null;
		if (PracticalTask2Employee.this.name == "Lobster") {
			L = PracticalTask2Employee.this.name;
		}
		if (PracticalTask2Employee.this.name == "Krevetko") {
			K = PracticalTask2Employee.this.name;
		}
		return L + " is a big " + K;
	}
}

