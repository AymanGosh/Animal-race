package animals;

import mobility.Point;

/**
 * 
 * @author איימן
 *this water animal alligator 
 */
public class Alligator extends WaterAnimal {

	private String	AreaOfLiving ;
	
	public Alligator(Point location, String name, double weight, double speed) {
		super(location, name, weight, speed);
		 
	}
	public Alligator(  String name, double weight, double speed) {
		super(  name, weight, speed);
		 
	}
	/**
	 * make his sound 
	 */
	public String Sound() {
		 
		return "Roar";
	}

}
