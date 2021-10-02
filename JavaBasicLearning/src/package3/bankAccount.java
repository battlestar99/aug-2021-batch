package package3;

public class bankAccount {
	
	String accountOwnername ; 
	int moneyInwallet; 
	String address; 
	static int numberofUser; 
	
	
	public static void distbaleccount(int x) {
		
		System.out.println("disabling account");	
		
	}
	
	
	
	public void depositMoney(int amount) {
		
		int x; 
		
		moneyInwallet=amount; 
		
		System.out.println(amount);
		System.out.println(" is deposited");
		 
	}
	
	public int addMoneyInwallet(int addAmount) {
		
		moneyInwallet = moneyInwallet+addAmount; 
		
		return moneyInwallet;
		
	}
	
	public void cancelAccount() {
		
		
		
	}
	
	
	
	

}
