
public class HowToUseAbstractClass extends MyAbstractClass {

	private static final String M2 = "m2";

	@Override
	public void m2() {
		System.out.println(M2);
	}

	public static void main(String[] args) {
		HowToUseAbstractClass howToUseAbstractClass = new HowToUseAbstractClass();
		howToUseAbstractClass.sum();
		howToUseAbstractClass.m2();
	}

}
