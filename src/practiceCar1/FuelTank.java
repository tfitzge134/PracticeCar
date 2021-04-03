package practiceCar1;

public class FuelTank extends CarPart {
	private double regularPrice;

	// private double mediumPrice;
	private int gallon;
	private int fuelLevel;

	private String FuelPrice;

	public static final int FUEL_LEVEL_FULL = 10;

	public FuelTank() {
		super();
		this.condition = 0;
		this.partDescription = "Gas Tank";
		this.fuelLevel = 0;

	}

	// constructor
	public FuelTank(int gallon, double regularPrice, int condition) {

		/*
		 * if(numberOfCylinders != 4 || numberOfCylinders !=6) {
		 * System.out.println("Engine value is wrong"); }
		 */
		this.gallon = gallon;

		// this.Cylinders =numberOfCylinders;

		this.condition = condition;

		this.partDescription = "Gas Tank";
		this.setRegularPrice(regularPrice);

	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	public int getGallon() {
		return gallon;
	}

	public void setGallon(int gallon) {
		this.gallon = gallon;
	}

	public void FuelPrice(int gallon) {
		if (gallon <= 10) {
			regularPrice = 2.50;

			System.out.println(" the price is " + regularPrice + " " + gallon);
		} else {
			regularPrice = 3.00;
			System.out.println(" the price is " + regularPrice + " " + gallon);
		}

	}

	public String FuelPrice() {
		return FuelPrice;
		// return FuelPrice();
	}

	public void function() {
		if (condition == 100) {
			System.out.println("Your " + this.partDescription + " is good");
			System.out.println("Your " + this.partDescription + " is on fair condition, " + "you got " + gallon
					+ " gallons at a price of " + regularPrice + " per gallon");
		} else {
			if (condition == 0) {
				System.out.println("Your " + this.partDescription + " is bad");
				System.out.println("Your " + this.partDescription + " is on fair condition, " + "you got " + gallon
						+ " gallons at a price of " + regularPrice + " per gallon");
			} else {
				System.out.println("Your " + this.partDescription + " is on fair condition, " + "you got " + gallon
						+ " gallons at a price of " + regularPrice + " per gallon");

			}
		}

	}
}
