package com.halilbisgin.zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal aObject = new Animal();
		Cat cObject = new Cat("Tabby");
		ZooKeeper zkeeper = new ZooKeeper();
		
		aObject.makeSound();
		cObject.makeSound();
		cObject.displayInfo();
		zkeeper.takeCare(aObject);

	}

}
