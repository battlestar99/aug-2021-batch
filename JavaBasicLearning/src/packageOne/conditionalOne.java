package packageOne;

public class conditionalOne {

	public static void main(String[] args) {
		
		int x = 15; 
		int y = 11; 
		int z = 12; 
		
		
		boolean cond1 = (x>y);
		boolean cond2 = (x>z);
		boolean cond3 = (z>x);
		
		
		if(cond1) {
			
			System.out.println("x is greater than y");
			
		}
		
		
		
     if(cond2) {
			
			System.out.println("x is greater than z");
			
		}
     
     if(cond3) {
			
			System.out.println("z is greater than x");
			
		}
		

	}

}
