package se.xperjon.zoo.core.animals;

public class Snake extends Reptile {
	private static final int FEEDING_HOUR_OF_DAY = 3;

	@Override
	public int getFeedingHourOfDay() {
		return FEEDING_HOUR_OF_DAY;
	}

}
