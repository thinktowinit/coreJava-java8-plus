
public class MyInnerClass {

	class Mobile {

		int price = 22;

	}

	class Transport {

		int price = 33;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInnerClass myInnerClass = new MyInnerClass();
		Transport transport = myInnerClass.new Transport();
		System.out.println(transport.price);

		Mobile mobile = myInnerClass.new Mobile();
		System.out.println(mobile.price);

	}

}
