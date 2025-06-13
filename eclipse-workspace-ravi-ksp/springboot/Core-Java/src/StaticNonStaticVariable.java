
public class StaticNonStaticVariable {
	
	public int studentAddharCard; //non static
	public static String studentSchoolName; //static
	
	public void m1() {
		
		System.out.println(studentAddharCard);
		System.out.println(studentSchoolName);

	}
	
	public static void main(String[] args) {
		
		
		StaticNonStaticVariable forStudent1 = new StaticNonStaticVariable();
		forStudent1.studentAddharCard = 1; //non-static
		//forStudent1.studentSchoolName="Vivekananda";//static
		
		StaticNonStaticVariable forStudent2 = new StaticNonStaticVariable();
		forStudent2.studentAddharCard = 2;
		//forStudent2.studentSchoolName="Vivekananda";
//		
		
		
		StaticNonStaticVariable.studentSchoolName = "Vivekananda";
		//StaticNonStaticVariable.studentAddharCard = 333;//error class will call only static variables
		
		forStudent1.m1();
		forStudent2.m1();
		
		
	}

}
