package carDealerSoft;

public class carDealerVersion1 {

	public static void main(String[] args) {
		
		double basePrice = 30000; 
		double downPayment = 6000; 
		double adminfee = 800; 
		double taxRate = 4; 
	    double financeAmount; 
	    double taxAmount; 
	    double interestAmount; 
	    double totalFinance; 
	    double apr = 0; 
	    
	    int months = 72; 
	    
	    double monthlypayment; 
	    
	    int creditScore = 700;
	    
	    
	    double totalPrice = basePrice + adminfee; 
	    
	    System.out.println("Total price without tax");
	    System.out.println(totalPrice);
	    
	    taxAmount = totalPrice*(taxRate/100);
	    
	    
	    System.out.println("Total tax for the car");
	    System.out.println(taxAmount);
	    
	    financeAmount = (totalPrice+taxAmount)-downPayment;
		
	    System.out.println("Amount needs to be financed");
	    System.out.println(financeAmount);
	    
	    
	    if(creditScore>=700) {
	    	
	    	apr = 2; 
	    	
	    }
	    
    if(creditScore<700) {
	    	
	    	apr = 4; 
	    	
	    }
    
    interestAmount = financeAmount*(apr/100);
    
	    
    System.out.println("total interest amount");
    System.out.println(interestAmount);
      
    totalFinance =  financeAmount+interestAmount; 
	    
    System.out.println("total finance amount");
    System.out.println(totalFinance);  
	    
	    
    monthlypayment =  totalFinance/months;
	    
    System.out.println("Monthly payment");
    System.out.println(monthlypayment);   
	    
		

	}

}
