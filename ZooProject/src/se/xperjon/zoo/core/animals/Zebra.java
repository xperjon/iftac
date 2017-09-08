package se.xperjon.zoo.core.animals;

public class Zebra extends Mammal{

	private static final int FEEDING_HOUR_OF_DAY=3;

	@Override
	public int getFeedingHourOfDay() {
		return FEEDING_HOUR_OF_DAY;
	}

}
