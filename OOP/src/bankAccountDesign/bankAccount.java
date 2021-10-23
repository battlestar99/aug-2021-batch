package bankAccountDesign;

public class bankAccount {
	
	
	// properties of the class 
	
	int amountOfMoney; 
	String nameOftheAccount; 
	String email; 
	String city; 
	
	static int numberofCustomer; 
	
	// constructor overloading 
	
	public bankAccount(String nameOftheAccount) {
		
		this.nameOftheAccount=nameOftheAccount;
		
	}

	public bankAccount() {
		
		System.out.println("constructor with no input");
		
	}
	
	
	
	
	public static void resetAccount() {
		
		System.out.println("resetting money");	
		
	}
	
	// methods of the class
	
	public void depositMoney() {
		
	System.out.println("depositing money");	
		
	}
	
	public void withdrawMoney() {
		
		System.out.println("withdrawting money");	
		
	}
	
   public void updateAccount() {
		
		System.out.println("updating account info");	
		
	}
   
   
   public void updateAccount(String x) {
	   
	   System.out.println("updating account info function 2"); 
   }
	
	
	

}
