
public class SumOperationWithMethodParams {

	public int sum(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		SumOperationWithMethodParams sumOperationWithMethodParams = new SumOperationWithMethodParams();
		
		
		System.out.println(sumOperationWithMethodParams.sum(2, 3)); //5
		
		//using util class
		//SumUtil sumUtil = new SumUtil(); // 2 bytes
		//sumUtil.sum(4, 5);
		//int sum = SumUtil.sum(2, 3);
		//System.out.println(sum);
		System.out.println(SumUtil.sum(2, 3, 7));  // 6 months work not effected
		

	}

}
