package se.xperjon.zoo;

import se.xperjon.zoo.core.Feeder;
import se.xperjon.zoo.core.Zoo;
import se.xperjon.zoo.core.animals.Flamingo;
import se.xperjon.zoo.core.animals.Lion;
import se.xperjon.zoo.core.animals.Snake;
import se.xperjon.zoo.core.animals.Zebra;

public class ZooApp {

	public static void main(String[] args) {
		Zoo myZoo = new Zoo();
		myZoo.addAnimal(new Snake());
		myZoo.addAnimal(new Zebra());
		myZoo.addAnimal(new Lion());
		myZoo.addAnimal(new Flamingo());
		myZoo.setTemperature(22);
		
		System.out.println("-------------DAY 1------------");
		Feeder feeder = new Feeder();
		feeder.feedAnimals(myZoo);
		
		System.out.println("-------------DAY 2------------");
		myZoo.setTemperature(26);
		feeder.feedAnimals(myZoo);
		
	}

}
