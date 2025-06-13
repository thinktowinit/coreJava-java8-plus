//@getterssetters
public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private char gender;
	private boolean isAdmin;
	private String bloodGroup;
	private int bloodGroupPrice;
	
	
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getBloodGroupPrice() {
		return bloodGroupPrice;
	}
	public void setBloodGroupPrice(int bloodGroupPrice) {
		this.bloodGroupPrice = bloodGroupPrice;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean getIsAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
		
	

}
