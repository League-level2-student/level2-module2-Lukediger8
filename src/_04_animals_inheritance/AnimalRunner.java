package _04_animals_inheritance;

import _03_animals_original.Cat;
import _03_animals_original.Dog;

/*
 * 1. Similar to the shapes example, use inheritance to create classes 
 *   in order for this code to work.
 * 
 * HINT: We need a Super class to have all the things that Dog and Cat 
 *       have in common. Lets call that class Animal.
 */
public class AnimalRunner {
	public static void main(String[] args) {
		Dog d = new Dog("Lucy", "brown", true);
		d.printName();
		d.play();
		d.eat();
		d.sleep();
		
		Cat c = new Cat("Tom", "black", false);
		c.printName();
		c.play();
		c.eat();
		c.sleep();
	}
}
