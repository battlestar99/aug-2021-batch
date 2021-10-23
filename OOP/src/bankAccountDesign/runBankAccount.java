package bankAccountDesign;

public class runBankAccount {

	public static void main(String[] args) {
		
		bankAccount mike = new bankAccount("mike");
		
		bankAccount jon; 
		
		checkingAccount alec = new checkingAccount("dfds");
		
		alec.depositMoney();
		
		savingAccount jim = new savingAccount();
		
		
		
		bankAccount.numberofCustomer=347943;
	
		
		jon = new bankAccount("Jon");
		
		System.out.println(mike.nameOftheAccount);
		System.out.println(jon.nameOftheAccount);
		
		mike.city="Fairfax";
		
		System.out.println(mike.city);
		
		System.out.println(mike.email);
		
		

	}

}
