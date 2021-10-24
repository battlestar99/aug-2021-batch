package car;

public class car {
	
	
	
	public String vinNumber; 
	int mileage; 
	
	
	int getMileage() {
		
		return 12; 
	}
	
	
	
	public void start() {
		stop();
		System.out.println("car is starting");
		
	}
	
	public void stop() {
		
		System.out.println("car is stopped");
		
	}

}
