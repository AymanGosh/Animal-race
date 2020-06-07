package animals;

import mobility.Point;

/**
 * the cat class 
 * @author איימן
 *
 */
public class Cat extends TerrestrialAnimals {

	private boolean Castrated ;
	
	public Cat(Point location, String name, double weight, double speed) {
		super(location, name, weight, speed);
	}
	public Cat(  String name, double weight, double speed) {
		super( name, weight, speed);
	}
	
	public String Sound() {
		 
		return "Meow";
	}
}
