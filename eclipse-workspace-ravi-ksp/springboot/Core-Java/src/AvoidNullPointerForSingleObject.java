
public class AvoidNullPointerForSingleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("x");
		employee.setSalary(22);

		Employee employee2 = new Employee();
		employee2.setId(8);
		employee2.setSalary(22);
		// name is null

		// above is db

		// get data from db using id = 2
		// get single employee
		Employee employeeFromDb = employee; // from db

		if (employeeFromDb != null) {
			int salary = employee.getSalary();
			String name = employee.getName();

			if (name.equals("Jagan")) { // if name=null null pointet //null.equals("Jagan"); //null pointer exception

			}
			if ("Jagan".equals(name)) { // if name=null null pointet //"Jagan".equals(null) // false

			}
			if ("Jagan".equalsIgnoreCase(name)) { // if name=null null pointet

			}
			
			//another formula
			//old process, use StringUtils for new pricess
			if(name != null && !("".equals(name))) {  //check name length when name is not null and not empty
				int length = name.length(); 
			}
			
			
			
			
			
		}

	}
	
	

}
