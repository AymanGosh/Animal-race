package animals;

import mobility.Point;

/**
 * dolphin class 
 * @author איימן
 *
 */
public class Dolphin extends WaterAnimal {

	 private enum WaterType{Sea, Sweet} ;
	 
	public Dolphin(Point location, String name, double weight, double speed) {
		super(location, name, weight, speed);
		 
	}
	
	/**
	 * contructor with out point 
	 * @param name
	 * @param weight
	 * @param speed
	 */
	public Dolphin( String name, double weight, double speed) {
		super(  name, weight, speed);
		 
	}
	
	public String Sound() {
		 
		return "Click-click";
	}

}
