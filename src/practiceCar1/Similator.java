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
			System.out.println("Enter numberOfCylinders: ");
			line = scan.nextLine();
			numberOfCylinders = Integer.parseInt(line);
		} catch (NumberFormatException ex) {
			System.out.println("Enter a VALID number for numberOfCylinders.");
			System.exit(0);
		}

		int condition = 0;
		try {
			System.out.println("Enter condition: ");
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
		System.out.println("Enter part Description: ");
		partDescription = scan.nextLine();

		int tireCondition = 0;
		System.out.println("Enter tire Condition: ");
		line = scan.nextLine();
		try {
			tireCondition = Integer.parseInt(line);
		} catch (NumberFormatException ex) {
			System.out.println("Enter a VALID number for size.");
			System.exit(0);
		}

		
////		
		
		// Create tires based user input
		Tires t = new Tires(size, partDescription, tireCondition);
		t.function();
		////
				int gallon = 0;
				try {
					System.out.println("Enter gallons: ");
					line = scan.nextLine();
					gallon = Integer.parseInt(line);
				} catch (NumberFormatException ex) {
					System.out.println("Enter a VALID number for numberOfCylinders.");
					System.exit(0);
				}

				double price = 0;
				try {
					System.out.println("Enter price: ");
					line = scan.nextLine();
					price = Double.parseDouble(line);
				} catch (NumberFormatException ex) {
					System.out.println("Enter a VALID number for condition.");
					System.exit(0);
				}
				int tankCondition = 0;
				System.out.println("Enter tank Condition: ");
				line = scan.nextLine();
				try {
					tankCondition = Integer.parseInt(line);
				} catch (NumberFormatException ex) {
					System.out.println("Enter a VALID number for size.");
					System.exit(0);
				}
				
				
		FuelTank f = new FuelTank(gallon, price, condition);
		f.function();
		System.out.println("========");
		//FuelTank f = null;
		Wheel w = null;
		//Car c2 = new Car(e, t, f, w);

	}

}
