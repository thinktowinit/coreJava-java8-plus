
public class SetGetEmployeeValues {
	
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("stgdfgf");
		//employee.setSalary(222); // not have setter method
		//employee.salary = 444; //not used otside class, y bcz private variable.
		employee.setGender('m');
		employee.setAdmin(true);
		
		//employee.getId();
		employee.getName();
		employee.getSalary();
		employee.getGender();
		employee.getIsAdmin();
		
		System.out.println("emp id  = "+employee.getId());
		System.out.println("Emp salary = "+employee.getSalary());
		
		
	}

}
