
public class SumUtil {

	public static int sum(int x, int y, int z, Integer... b) {

		// 20 lines code
		return x + y + z;

	}

	// don't preffer below method, when re use above logic,
	// better to use optional method params
	public static int sum45(int x, int y, int z, int u) {

		// 20 lines code
		return x + y + z;

	}

	public static int sum2(int x, int y, Integer... b) {

		// SumUtil.sum(2,3);
		// SumUtil.sum(2,3,4);
		// SumUtil.sum(2,3,4,5); x=2, y=3, b[0]=4, b[1]=5
		return x + y + b[0];
	}

}
