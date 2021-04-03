package practiceCar1;

public class Wheel extends CarPart{
	public double turningDegrees;
	
	public Wheel( ) {
		super();
		this.condition = 0;
		this.partDescription= "Wheel";
	}
	
//constructor
	public Wheel(double turningDegrees, int condition) {
	
		this.turningDegrees = turningDegrees;	
		
		this.condition =condition;
		
		this.partDescription="Wheel";
		
	}
	public void printTurningDegrees() {
		System.out.println("you are turning at a degree of  " + turningDegrees);
	}
	
	//print out the function  with messages
	public void function() {
		if (condition ==100) {
			System.out.println("Your "+ this.partDescription  + " is good");
			printTurningDegrees();
		}
		else {
			if (condition ==0 ) {
				System.out.println("Your "+ this.partDescription + " is bad");
				printTurningDegrees();
			}
			else {
				System.out.println("Your "+ this.partDescription + " is fair");
				printTurningDegrees();
			}
		}
		
	}
	
}


