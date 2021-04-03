package practiceCar1;


public class CarPart implements Functional{
	
	public int condition;
	public String partDescription;
	
	CarPart(){
		condition = 100;
	}
	
	//method status
	public void status() {
		System.out.println("Condition: " + this.condition);
	}


	public void function() {
		
	}

}
