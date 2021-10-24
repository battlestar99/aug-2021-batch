package runPackage;

public class trialRun {

	public static void main(String[] args) {
		
		
		int x= 0; 
		
		int y = 10; 
		
		int z; 
		
		try {
		
		z = y/x;
		
		System.out.println(z);
		}
		
		catch(ArithmeticException e){
			
		System.out.println(e.getMessage())	;
		System.out.println("divide by zero is not possible");
			
		}
		
		
		int a = 45; 
		int b = 56; 
		System.out.println(a+b);
		
		
	}

}
