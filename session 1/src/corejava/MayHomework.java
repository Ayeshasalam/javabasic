package corejava;

public class MayHomework {

	public static void main(String[] args) {  
		
	try {
		int x = 10;
		int y = 0;
		int result = x / y;
		System.out.println("Result :"+result);
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception :"+e);
	}catch(ArithmeticException e1) {
		System.out.println("Exception:"+e1);
		
	}
	finally {
	System.out.println("last line of the program ");
	}
		

	}

}
