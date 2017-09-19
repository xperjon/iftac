package cars;

import java.util.ArrayList;
import java.util.List;

public class MyApp {

	public static void main(String[] args) {
		
		
		Car v70 = new Volvo();
		Car i9000 = new Saab();
		
		v70.repair();
		i9000.repair();
		
		
		
		
		
		
//		List<Car> cars = new ArrayList<Car>();
//		cars.add(new Saab());
//		cars.add(new Volvo());
//		new CarWorkshop(cars).repairCars();
	}
}
