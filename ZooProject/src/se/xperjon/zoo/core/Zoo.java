package se.xperjon.zoo.core;

import java.util.ArrayList;
import java.util.List;

import se.xperjon.zoo.core.animals.Animal;

public class Zoo {
	private List<Animal> animals = new ArrayList<>();
	private int temperature = 28;

	public List<Animal> getAnimals() {
		return animals;
	}
	
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
}
