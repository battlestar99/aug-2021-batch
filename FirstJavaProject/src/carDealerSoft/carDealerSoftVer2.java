package carDealerSoft;

import java.util.Scanner;

public class carDealerSoftVer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		 System.out.println("Enter the base price of the car");		
		double basePrice = sc.nextDouble(); 
		
		System.out.println("Enter the downpayment of the car");		
		double downPayment = sc.nextDouble(); 
		double adminfee = 800; 
		double taxRate = 4; 
	    double financeAmount; 
	    double taxAmount; 
	    double interestAmount; 
	    double totalFinance; 
	    double apr = 0; 
	    
	    int months = 72; 
	    
	    double monthlypayment; 
	    
	    System.out.println("Enter the credit score of the buyer");		
	    int creditScore = sc.nextInt();
	    
	    
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
