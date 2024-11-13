package com.halilbisgin.abstractpractice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal(); //this is illegal! Because Animal is an abstract class. 
		ArrayList<Animal>animals = new ArrayList<>();
		Horse horse = new Horse(); ///Horse("Daisy")
		horse.makeSound();
		Dog doggie = new Dog();
		doggie.aboutMe();
		doggie.makeSound();
		
		animals.add(doggie);
		animals.add(horse);
		System.out.println("--------------------------------------------");
		for(Animal animal:animals)
		{
			animal.makeSound(); //can I call aboutMe method here?
			//animal.aboutMe(); //The main reason is actually my superclass doesn't have this method in the first place!!!
		}

	}

}
