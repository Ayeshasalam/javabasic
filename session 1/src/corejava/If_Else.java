package corejava;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		System.out.println("What operation do you want to do?");
		
		Scanner inputOp = new Scanner(System.in);
		String operationType;
			operationType = inputOp.nextLine();
			
		if (operationType.equalsIgnoreCase("add")) {
			System.out.println(add(5,5));
		}
		else if(operationType.equalsIgnoreCase("sub")) {
			System.out.println(sub(5,5));
		
		}
		else if(operationType.equalsIgnoreCase("mul")) {
			System.out.println(mul(5,5));
		}
		else if(operationType.equalsIgnoreCase("div")) {
			System.out.println(div(5,5));
		}
		else {
			System.out.println("Not sure what you want to do?");
		}
	}
		
			
		
		 
public static int add(int a, int b)  {
	return a+b;
} 
public static int sub(int a,  int b) {
	return a-b;
}
public static int mul(int a, int b) {
     return a*b;
}
public static int  div(int a, int b) {
	  return a/b;
}
}

			
			
		
	   
	
		
		

	


