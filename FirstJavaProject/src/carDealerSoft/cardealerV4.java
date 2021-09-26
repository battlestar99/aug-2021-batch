package carDealerSoft;

public class cardealerV4 {

	public static void main(String[] args) {
	
		carUtility car = new carUtility();
		
		
		
		double totalcarprice = car.getTotalPrice(20000, 4000);
		
		double taxamount = car.getTaxAmount(totalcarprice, 7);
		
         double financeamount =  car.getFinanceAmount(totalcarprice, taxamount, 5000);
	
	     double apr = car.getApr(650);
	     
	     double interestAmount = financeamount*(apr/100);
	      
		 double  totalFinance =  financeamount+interestAmount; 
	     
	     double monthlypayment = car.getMonthlyPayment(totalFinance,60);
	     
	     System.out.println(monthlypayment);
	     
	     
	     
	     
	     
	
	}

}
