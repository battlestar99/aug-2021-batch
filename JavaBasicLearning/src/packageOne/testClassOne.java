package packageOne;

public class testClassOne {

	public static void main(String[] args) {
		
		boolean flag; 
		int x = 14; 
		int y = 34; 
		
		System.out.println(x);
		System.out.println(y);
		
		// assigning value
		x=y; 
		
		
		flag = (x==y) ;
		flag = (x>y);
		
		
		System.out.println(x);
		
		if(flag) {
			
			System.out.println("This is a testing");
			System.out.println(flag);
		}
		
	}

}
