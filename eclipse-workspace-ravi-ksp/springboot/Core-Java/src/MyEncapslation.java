
public class MyEncapslation {
	
	private static final int NUMBER1 = 66;
	private int x = 6;
	
	
	
	public void setX(int x) {
		
		this.x = x;
	}
	
	public int getX() {
		
		return x;
	}
	
	public static void main(String[] args) {
		
		MyEncapslation myEncapslation = new MyEncapslation();
		myEncapslation.x = NUMBER1;
		myEncapslation.setX(2);
		int c = myEncapslation.getX();
			System.out.println(c);	
		
	}

}
