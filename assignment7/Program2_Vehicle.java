package assignment7; 

class Vehicle{
	String brand;
	int speed;
	static String company = "AutoWorld Ltd";
	
	Vehicle(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
		}
	
	
	
	void run() {
		System.out.println("Vehicle is Running");
	}
	
	static void displayCompany() {
		System.out.println("Company: " +company);
	}
	
	final void engineType() {
		System.out.println("Engine Type: Standard Engine ");
	}
	
}

class Car extends Vehicle{
	String fuelType;
	
	Car(String brand, int speed, String fueltype)
	{
		super(brand,speed);
		this.fuelType = fuelType;
	}
	
	
	void run() {
		super.run();
		System.out.println("Car is Running smoothly");
	}
	//final void engineType() {  //Final method override in car class getting error
		//System.out.println("Engine Type: Standard Method ");
	//}
}

public class Program2_Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("Hyundai", 120, "Petrol");
		 System.out.println("Brand: " + c.brand);
	     System.out.println("Speed: " + c.speed);
	     System.out.println("Fuel Type: " + c.fuelType);

		c.run();
		Vehicle.displayCompany();
		c.engineType();
		
		String brandName = "Hyundai";
	    String reverse = "";
	    
	    for (int i=brandName.length()-1; i>=0; i--) {
	    	
	    	reverse = reverse + brandName.charAt(i);
	    	
	    }
		
		System.out.println("Reversed: "+reverse);
		System.out.println(brandName.replaceAll("[aeiouAEIOU]","*"));
		
		
		System.out.println(brandName.equals("Hyundai"));

	}

}
