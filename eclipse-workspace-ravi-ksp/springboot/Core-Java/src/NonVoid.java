
public class NonVoid {
	
	
	int x= 2;
	int y =8;
	public int sumTwoNumbers(){
	  int sum = x+y; //10
	return sum;
	}
	
	public int sumTwoNumbersInOneLine(){
		  //int sum = x+y; //10
		return x+y;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonVoid nonVoid = new NonVoid(); //without object I can't use 
		
		//voidMethod.sumTwoNumbers();
		int box= nonVoid.sumTwoNumbers();
		int box2= nonVoid.sumTwoNumbersInOneLine();
		System.out.println("sum of two numbers after method call= "+box);
		System.out.println("sum of two numbers after method call= "+box2);

	}
	
	

}
