
public class HowToUseInterface implements MyInterface {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4");
	}
	
	
	public static void main(String[] args) {
		HowToUseInterface howToUseInterface = new HowToUseInterface();
		howToUseInterface.m2();
		howToUseInterface.m3();
		howToUseInterface.m4();
		
		//assign object to interface
		MyInterface myInterface = new HowToUseInterface();
		myInterface.m2();
		myInterface.m3();
		myInterface.m4();
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}
	
	

}
