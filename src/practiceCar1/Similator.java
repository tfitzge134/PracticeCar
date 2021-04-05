package practiceCar1;

import java.util.Scanner;

public class Similator {

	public static void main(String[] args) {
		//Car c = new Car(new Engine(4, 0), new Tires(60, "goodYear", 0), new FuelTank(3, 3, 4), new Wheel(3, 0));

		//c.run();
		System.out.println("-----------------");
		Scanner scan = new Scanner(System.in);
		String line;
		int numberOfCylinders = 0;
		try {
			System.out.println("Enter number of Cylinders, 4 or 6: ");
			line = scan.nextLine();
			numberOfCylinders = Integer.parseInt(line);
			if(numberOfCylinders != 4 && numberOfCylinders != 6) {
				System.out.println(
						"Enter a VALID number for numberOfCylinders, 4 or 6");
				System.exit(0);
			}
		} catch (NumberFormatException ex) {
			System.out.println(
					"Enter a VALID number for numberOfCylinders, 4 or 6");
			System.exit(0);
		}

		int condition = 0;
		try {
			System.out.println("Enter condition number "
					+ "from 1 to 100: ");
			line = scan.nextLine();
			condition = Integer.parseInt(line);
		} catch (NumberFormatException ex) {
			System.out.println("Enter a VALID number for condition.");
			System.exit(0);
		}

		Engine e = new Engine(numberOfCylinders, condition);
		e.setRunning(true);
		e.function();
		System.out.println("========");
		// Create tires

		// Read values from the user, using Scanner.
		int size = 0;

		try {
			System.out.println("Enter size of tires: ");
			line = scan.nextLine();
			size = Integer.parseInt(line);
		} catch (NumberFormatException ex) {
			System.out.println("Enter a VALID number for size.");
			System.exit(0);
		}

		String partDescription = null;
		System.out.println("Enter tires part Description: ");
		partDescription = scan.nextLine();

		int tireCondition = 0;
		System.out.println("Enter tires Condition number from 1 to 100: ");
		line = scan.nextLine();
		try {
			tireCondition = Integer.parseInt(line);
		} catch (NumberFormatException ex) {
			System.out.println("Enter a VALID number for condition.");
			System.exit(0);
		}

		
////		
		
		// Create tires based user input
		Tires t = new Tires(size, partDescription, tireCondition);
		t.function();
		////////////////////
		
		int tankCondition = 0;
				System.out.println("Enter tank Condition number"
						+ " from 1 to 100: ");
				line = scan.nextLine();
				try {
					tankCondition = Integer.parseInt(line);
				} catch (NumberFormatException ex) {
					System.out.println("Enter a VALID number"
							+ " for tank condition");
					System.exit(0);
				}
				
				int capacity = 0;
				if(numberOfCylinders == 4) {
					capacity = 12;
				}
				else if(numberOfCylinders == 6) {
					capacity = 15;
				}
				
				int gallonAvailable = 0;
				System.out.println("Enter Gallon available"
						+ ", max capacity "
						+ capacity + " : ");
				line = scan.nextLine();
				try {
					gallonAvailable = Integer.parseInt(line);
					if(gallonAvailable > capacity) {
						System.out.println("Enter a VALID number"
								+ " for gallonAvailable"
								+ ", max capacity "
								+ capacity);
						System.exit(0);
					}
				} catch (NumberFormatException ex) {
					System.out.println("Enter a VALID number"
							+ " for gallonAvailable"
							+ ", max capacity "
							+ capacity);
					System.exit(0);
				}
		
		
		FuelTank f = new FuelTank(gallonAvailable, condition, capacity);
		f.function();
		System.out.println("========");
////    
		double milesDriven;
		double gallonUsed = 0;
		double mpg = e.getMilesPerGallon();
		double maxMiles = (mpg * f.getGallonAvailable());
		try {
			System.out.println("Please enter MILES DRIVEN, max " + 
					maxMiles);
			line = scan.nextLine();
			milesDriven = Double.parseDouble(line);//10
			if(milesDriven > maxMiles) {
				System.out.println("Please enter VALID MILES DRIVEN, max " + 
						maxMiles);
				System.exit(0);
			}
			System.out.println("Current MILEAGE - mpg is: " + mpg);
			
			//10/2 = 5
			gallonUsed = milesDriven / mpg;
			System.out.println("Gallons used is: "
					+ gallonUsed);
			
			
			f.reduceGas(gallonUsed);
			System.out.println("Gallons AVAILABLE is: "
					+ f.getGallonAvailable());
			System.out.println("Gallons to be"
					+ " filled up is: "
					+ f.getFillableGallon());
			
			
		} catch (NumberFormatException ex) {
			System.out.println("Enter a VALID number"
					+ " for gallons.");
			System.exit(0);
		}

		double price = 0;
		try {
			System.out.println("Enter 2.50 for regular gas"
					+ " 3.50 for special and 4.0 for super gas: ");
			line = scan.nextLine();
			price = Double.parseDouble(line);
			if(price == 3.5 || price == 2.5 || price == 4) {
				double totalCost = f.getFillableGallon() * price;
				System.out.println("You need to pay $" + totalCost
						+ " to fill " + f.getFillableGallon() 
						+ " gallons.");
			} else {
				System.out.println("Enter a VALID number"
						+ " for price.");
				System.exit(0);
			}
			
		} catch (NumberFormatException ex) {
			System.out.println("Enter a VALID number"
					+ " for price.");
			System.exit(0);
		}

		System.out.println("========");
		//FuelTank f = null;
		double turningDegree = 0;
		try {
			System.out.println("Enter turning Degree in double: ");
			line = scan.nextLine();
			turningDegree = Double.parseDouble(line);
		} catch (NumberFormatException ex) {
			System.out.println("Enter a VALID number for"
					+ " turning degree.");
			System.exit(0);
		}

		int wheelCondition = 0;
		System.out.println("Enter Wheel Condition from 1 to 100 ");
		line = scan.nextLine();
		try {
			wheelCondition = Integer.parseInt(line);
		} catch (NumberFormatException ex) {
			System.out.println("Enter a VALID number for condition.");
			System.exit(0);
		}
		Wheel w = new Wheel(turningDegree,
			condition);
		w.function();
		

	}

}
