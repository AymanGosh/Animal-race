package animals;

import mobility.Point;

/**
 * dog class 
 * @author איימן
 *
 */
public class Dog extends TerrestrialAnimals {
	
	private String breed  ;
	
	public  Dog(Point location, String name, double weight, double speed) {
		super(location, name, weight, speed);
		
	}
	public  Dog( String name, double weight, double speed) {
		super( name, weight, speed);
		
	}
	 /**
	  * his sound 
	  */
	public String Sound() {
		 
		return "Woof-Woof";
	}
}
