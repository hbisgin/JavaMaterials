package com.halilbisgin.zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal aObject = new Animal();
		Cat cObject = new Cat("Tabby");
		
		aObject.makeSound();
		cObject.makeSound();
		cObject.displayInfo();

	}

}
