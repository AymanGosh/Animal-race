package animals;

import mobility.Point;

/**
 * whalr class extend from water animal 
 * @author איימן
 *
 */
public class Whale extends WaterAnimal {

	private String foodType ;
	
	public Whale(Point location, String name, double weight, double speed) {
		super(location, name, weight, speed);
	 
	}
	public Whale(  String name, double weight, double speed) {
		super( name, weight, speed);
		 
	}
	/**
	 * the sound of the animal 
	 */
	public String Sound() {
		 
		return "Splash";
	}

}
