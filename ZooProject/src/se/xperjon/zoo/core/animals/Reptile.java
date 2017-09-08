package se.xperjon.zoo.core.animals;

public abstract class Reptile extends Animal{

	@Override
	public boolean isFeedingConditionTrue(int temperature) {
		return temperature < 26;
	}

	@Override
	public String getFeedingConditionMessage() {
		return "Temperatur must be under 26 degrees!";
	}
	

}
