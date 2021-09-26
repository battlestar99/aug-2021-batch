package packageTwo;

public class runMainTwo {

	public static void main(String[] args) {
		
		
		utility obj = new utility();
		
		obj.run();
		
		int sum = obj.addTwoNumbers(54, 75);
		
		System.out.println(sum);
		
		sum = obj.addTwoNumbers(100, 200);
		
		System.out.println(sum);
		
		double x = obj.covCelToFer(40);
		
		System.out.println(x);
		
		
		
		
	}

}
