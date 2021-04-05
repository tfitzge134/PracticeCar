package practiceCar1;

public class FuelTank extends CarPart {
	private double price;

	// private double mediumPrice;
	private int gallon;
	//private int fuelLevel;

	private String FuelPrice;

	public static final int FUEL_LEVEL_FULL = 10;
	private boolean isTankEmpty=false;

	private int fuelLevel;

	public FuelTank() {
		super();
		this.condition = 0;
		this.partDescription = "Gas Tank";
		this.fuelLevel = 0;
		this.isTankEmpty=false;

	}

	// constructor
	public FuelTank(int gallon, double price,
			int condition) {

	
		this.gallon = gallon;

		// this.Cylinders =numberOfCylinders;

		this.condition = condition;

		this.partDescription = "Gas Tank";
		this.setPrice(price);

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getGallon() {
		return gallon;
	}

	public void setGallon(int gallon) {
		this.gallon = gallon;
	}


	public double price() {
		return price;
		// return FuelPrice();
	}
	public boolean isTankEmpty() {
		return isTankEmpty;
	}

	public void setisTankEmpty(boolean isTankEmpty) {
		this.isTankEmpty = isTankEmpty;
	}
	public void function() {
		double totalPrice =price * gallon;
		String status = "The tanks is empty " 
				+ (isTankEmpty ? "empty" : "NOT empty");
		if (condition <= 100 & condition >70) {
			System.out.println("Your " + this.partDescription + 
					" is in excellent condition" + status);
			
			System.out.println(
					 "you got " + gallon
					+ " gallons at a price of " 
					+ price + " per gallon" + " total price is " 
					+ totalPrice);
		} else {
			if (condition >= 0 & condition <=30) {
				System.out.println("Your " + 
			this.partDescription +
						" is bad");
				System.out.println(
						  "you got " + gallon
						+ " gallons at a price of "
						+ price + " per gallon"+ " total price is " 
						+ totalPrice);
			} else {
				System.out.println("Your " + this.partDescription + " is on bad condition, " + "you got " + gallon
						+ " gallons at a price of " +
						price + " per gallon" + " total price is " 
						+ totalPrice);

			}
		}

	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
}

 
