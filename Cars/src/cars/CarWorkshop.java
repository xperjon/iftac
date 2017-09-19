package cars;

import java.util.List;

public class CarWorkshop {

	private List<Car> carsToRepair;
	
	public CarWorkshop(List<Car> carsToRepair) {
		this.carsToRepair = carsToRepair;
	}

	public void repairCars() {
		for (Car car : carsToRepair) {
			car.repair();
		}
	}
}
