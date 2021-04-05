package practiceCar1;

public class FuelTank extends CarPart {

	// private double mediumPrice;
	private double gallonAvailable;
	private int capacity;

     double mileage;
     double mpg; //miles per gallon
    
     
	private int fuelLevel;

	public FuelTank() {
		super();
		this.condition = 0;
		this.partDescription = "Gas Tank";
	}

	// constructor
	public FuelTank(int gallonAvailable,
			int condition, int capacity) {

	
		this.gallonAvailable = gallonAvailable;

		this.condition = condition;

		this.partDescription = "Gas Tank";
		this.capacity = capacity;

	}
	public double getGallonAvailable() {
		return gallonAvailable;
	}

	public void setGallonAvailable(double gallonAvailable) {
		this.gallonAvailable = gallonAvailable;
	}


	public void GasPrice(boolean regularPrice,
			double mediumPrice, double
			supperPrice) {
		
		 if(regularPrice) {
			 System.out.println("Good choice regular");
			 
		
			
		}
		
	}
	public void function() {
		String status = "The tank is " 
				+ (gallonAvailable == 0? "empty" : "NOT empty");
		System.out.println(
				 "You got " + gallonAvailable +
				 " of capacity: " + capacity);
		if (condition <= 100 & condition >70) {
			System.out.println("Your " + this.partDescription + 
					" is in excellent condition" + status);
			
		} else {
			if (condition >= 0 & condition <=30) {
				System.out.println("Your " + 
			this.partDescription +
						" is bad");
			}
		}

	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public void reduceGas(double gallonUsed) {
//		int x = 10;
//		x -= 2; 
		this.gallonAvailable -= gallonUsed;
	}
	
	public double getFillableGallon() {
		return this.capacity - this.gallonAvailable;
	}
}

 
