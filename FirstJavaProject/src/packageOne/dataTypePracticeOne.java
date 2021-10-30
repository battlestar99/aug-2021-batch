package packageOne;

public class dataTypePracticeOne {

	public static void main(String[] args) {
		
		swapping(30, 20);
		
     
         
	}
	
	public static void swapping(int a, int b) {
		a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println(a);
		System.out.println(b);
	}

}
