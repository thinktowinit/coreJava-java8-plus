import com.constants.CoreJavaConstants;

public class GetBricksPrice {

	private static final String INVALID_BRICK_TYPE_MESSAGE = "please enter proper brick type, you entered invalid brick type";

	private BricksFactory getBrickTypeObjectBasedOnBrickType(String brickType) {
		// TODO Auto-generated method stub

		if (brickType.equalsIgnoreCase(CoreJavaConstants.SMALL_BRICKS)) {
			BricksFactory bricksFactory = new SmallBrciks();
			
			//BricksFactory - interface
			//SmallBrciks - class
			
			return bricksFactory;
		} else if (brickType.equalsIgnoreCase(CoreJavaConstants.BIG_BRICKS)) {
			BricksFactory bricksFactory = new BigBricks();
			return bricksFactory;
		}

		return null;
	}

	public static void main(String[] args) {

		GetBricksPrice getBricksPrice = new GetBricksPrice();

		BricksFactory bricksFactory = getBricksPrice.getBrickTypeObjectBasedOnBrickType("invalid bricks types");
		if (bricksFactory != null) { // != not equals
			int price = bricksFactory.getPrice();
			System.out.println(price);
		} else {
			System.out.println(INVALID_BRICK_TYPE_MESSAGE);
		}
	}

}
