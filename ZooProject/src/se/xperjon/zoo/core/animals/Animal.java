package se.xperjon.zoo.core.animals;

public abstract class Animal {
	protected int meals;

	public int getMeals() {
		return meals;
	}

	public void eat() {
		if (meals > 0) {
			meals--;
			System.out.println(getClass().getSimpleName() + " eating...");
		} else {
			System.out.println(getClass().getSimpleName() + " has no meals to eat!");
		}
	}

	public void feed() {
		meals++;
		System.out.println(getClass().getSimpleName() + " got new meal");
	}

	public boolean isFeedingConditionTrue(int temperature) {
		return true;
	}

	public String getFeedingConditionMessage() {
		return "";
	}

	public abstract int getFeedingHourOfDay();

}
