package carDealerSoft;

public class carDealerSoftV3 {

	public static void main(String[] args) {
		
		carUtility car = new carUtility();
		
		double basePrice = 20000; 
		double downPayment = 6000; 
		double adminfee = 600; 
		double taxRate = 4; 
	    double financeAmount; 
	    double taxAmount; 
	    double interestAmount; 
	    double totalFinance; 
	    double apr = 0; 
	    
	    int months = 72; 
	    
	    double monthlypayment; 
	    
	    int creditScore = 700;
	    
	   double totalprice =  car.getTotalPrice(basePrice,adminfee);
	    
		System.out.println(totalprice);
		
		double totaltax = car.getTaxAmount(totalprice, taxRate);
		
		System.out.println(totaltax);
		
		double totalfinanceAmount = car.getFinanceAmount(totalprice, totaltax, downPayment);

		apr = car.getApr(creditScore);
		
		interestAmount = totalfinanceAmount*(apr/100);
	      
	    totalFinance =  totalfinanceAmount+interestAmount; 
		
		double monthlypay = car.getMonthlyPayment(totalFinance, months);
		
		
		System.out.println(monthlypay);
	}

}
