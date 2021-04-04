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

		/*
		 * size,
				partDescription1, tireCondition);
		 * if(numberOfCylinders != 4 || numberOfCylinders !=6) {
		 * System.out.println("Engine value is wrong"); }
		 */
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

	public void price(int gallon) {
		if (gallon <= 10) {
			price = 2.50;

			System.out.println(" the price is " +
			price + " " + gallon);
		} else {
			price = 3.00;
			System.out.println(" the price is " +
			price + " " + gallon);
		}

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
		if (condition == 100) {
			System.out.println("Your " + this.partDescription + " is good");
			System.out.println("Your " + this.partDescription + " is on fair condition, " + "you got " + gallon
					+ " gallons at a price of " 
					+ price + " per gallon");
		} else {
			if (condition == 0) {
				System.out.println("Your " + this.partDescription + " is bad");
				System.out.println("Your " + this.partDescription + " is on fair condition, " + "you got " + gallon
						+ " gallons at a price of "
						+ price + " per gallon");
			} else {
				System.out.println("Your " + this.partDescription + " is on fair condition, " + "you got " + gallon
						+ " gallons at a price of " +
						price + " per gallon");

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
