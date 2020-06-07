package animals;

import mobility.Point;

/**
 * pigeon class extend from airanimal 
 * @author איימן
 *
 */
public class Pigeon extends AirAnimal{
	
	private String  family;
	
	public Pigeon(Point location, String name, double weight, double speed) {
		super(location, name, weight, speed);
		 
	}
	
	public Pigeon( String name, double weight, double speed) {
		super(  name, weight, speed);
		 
	}
/**
 * his sound 
 */
	public String Sound() {
		 
		return "Arr-rar-rar-rar-raah";
	}
	
	
}
