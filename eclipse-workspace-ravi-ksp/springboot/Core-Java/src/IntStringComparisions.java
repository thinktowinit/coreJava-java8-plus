import com.constants.CoreJavaConstants;

public class IntStringComparisions {

	private static final String ALLOWED_VOTING = "Allowed voting";
	int x = 20;
	String gender = CoreJavaConstants.MALE;

	private void m1() {
		// TODO Auto-generated method stub

		if (x > 10) {

			System.out.println(ALLOWED_VOTING);
		}

		if (gender.equalsIgnoreCase(CoreJavaConstants.MALE)) { // true
			System.out.println(CoreJavaConstants.MALE);
		}

		if (gender.equals(CoreJavaConstants.MALE)) { // false
			System.out.println(CoreJavaConstants.MALE);
		}

	}

	private void m2() {
		// TODO Auto-generated method stub
		System.out.println(ALLOWED_VOTING);
	}

}
