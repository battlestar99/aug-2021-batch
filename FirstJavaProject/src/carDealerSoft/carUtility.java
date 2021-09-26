package carDealerSoft;

public class carUtility {
	
	
	
	
	public double getTotalPrice(double baseprice, double adminfee) {
		
		double totalprice; 
		
		totalprice = baseprice+adminfee; 
		
		return totalprice;
		
		
	}
	
	
	public double getTaxAmount(double totalprice, double taxrate) {
		
	double taxAmount = totalprice*(taxrate/100);
		return taxAmount;
	}
	
	
	
	public double getFinanceAmount(double totalprice, double taxamount, double downpayment) {
		
		double financeAmt = (totalprice+taxamount)-downpayment;
		
		return financeAmt;
		
	}
	
	
	public double getApr(int creditScore) {
	
			double apr = 0;
	  
			
			if(creditScore>=700) {
		    	
		    	apr = 2; 
		    	
		    }
		    
			else if(creditScore<700 && creditScore>600 ) {
		    	
		    	apr = 4; 
		    	
		    }
	    
			else if(creditScore<=600 && creditScore>=500 ) {
	    	
	    	apr = 7; 
	    	
			}
	    
			else {
	    	
				System.out.println("the customer application is denied");	
	    	
			}
			
			
		return apr; 	
			
			
	}
	
	public double getMonthlyPayment(double totalfinancAmount, int months) {
		
		double monthlypayment = totalfinancAmount/months;
		return monthlypayment;
		
	}
	
	
	
	
	

}
