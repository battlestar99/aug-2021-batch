package packageOne;

public class conditonalTesting {

	public static void main(String[] args) {
		
		int x = 10; 
		int y = 11; 
		int z = 13; 
		
		boolean flag1 = (x>y+z);//false
		boolean flag2 = (x>y-z); // true
		
		boolean abc; 
		
		abc = true; 
		
		
		if(flag1) {
			
		System.out.println("x is greater than y summation z");	
			
		}
		
		else {
			
			System.out.println("conidtion one is false");	
		}
		
		
		
		if(flag2) {
			
			System.out.println("x is greater than y subtract z");		
			
		}
		
		else {
			System.out.println("condition 2 is false");			
			
		}
		

	}

}
