package se.xperjon.zoo.core;

import se.xperjon.zoo.core.animals.Animal;

public class Feeder {

	private static int HOURS_IN_DAY = 12;

	public void feedAnimals(Zoo zoo) {
		for (int hour = 0; hour < HOURS_IN_DAY; hour++) {
			System.out.println("Time is now: " + hour + " hour");
			for (Animal animal : zoo.getAnimals()) {
				if (hour == animal.getFeedingHourOfDay()) {
					if (animal.getMeals() > 0) {
						System.out.println(animal.getClass().getSimpleName() + " still have meals left!");
					} else {
						if (animal.isFeedingConditionTrue(zoo.getTemperature())) {
							animal.feed();
						} else {
							System.out.println("Not feeding " + animal.getClass().getSimpleName() + " because "
									+ animal.getFeedingConditionMessage());
						}
					}
				} else {
					animal.eat();
				}
			}
		}
	}

}
