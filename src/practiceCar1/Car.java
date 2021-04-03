package practiceCar1;

import java.util.ArrayList;

public class Car {
	// create a new array list named carcomponent that will store car part strings
	ArrayList<CarPart> carComponents = new ArrayList<>();

	public Car() {
		this(new Engine(), new Tires(), new FuelTank(), new Wheel());
	}

	public Car(Engine e, Tires t, FuelTank f, Wheel w) {
		carComponents.add(e);
		carComponents.add(t);
		carComponents.add(f);
		carComponents.add(w);

	}

	public void run() {
		for (int i = 0; i < carComponents.size(); i++) {
			carComponents.get(i).function();

		}

	}

}
