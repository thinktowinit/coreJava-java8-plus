
public class VoidMethod {
	
	
	int x= 2;
	int y =8;
	public void sumTwoNumbers(){
	  int sum = x+y; //5
	System.out.println("sum of two numbers = "+sum); //10
	//here not have return key word for void method
	}
	
	public void sumTwoNumbersInOneLine(){
		 // int sum = x+y; //5
		System.out.println("sum of two numbers = "+(x+y)); //10
		//here not have return key word for void method
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidMethod voidMethod = new VoidMethod(); //without object I can't use 
		
		voidMethod.sumTwoNumbers();
		voidMethod.sumTwoNumbersInOneLine();

	}

}
