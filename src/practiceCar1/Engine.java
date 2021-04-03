package practiceCar1;

public class Engine extends CarPart {
	public int Cylinders;
	private boolean isRunning;

	public Engine() {
		super();
		this.condition = 0;
		this.partDescription = "Engine";
		this.isRunning = false;

	}

//constructor
	public Engine(int numberOfCylinders, int condition) {

		this.Cylinders = numberOfCylinders;

		this.condition = condition;

		this.partDescription = "Engine";
		this.isRunning = false;
	}

	public void printCylinders() {
		System.out.println("The number of Cylinder is " + Cylinders);
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	// print out the function with messages
	public void function() {
		String status = "The engine is " + (isRunning ? "Running" : "NOT Running");
		if (condition == 100) {
			System.out.println("Your " + this.partDescription + " is good. " + status);
			printCylinders();
		} else {
			if (condition == 0) {
				System.out.println("Your " + this.partDescription + " is bad." + status);
				printCylinders();
			} else {
				System.out.println("Your " + this.partDescription + " is fair." + status);
				printCylinders();
			}
		}

	}

}
