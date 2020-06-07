package animals;

import mobility.Point;

/**
 * snake class 
 * @author איימן
 *
 */
public class Snake extends TerrestrialAnimals implements IReptile {

	
	private enum Poisonous {}; 
	
	private double length ; 

	public Snake(Point location, String name, double weight, double speed) {
		super(location, name, weight, speed);
		 
	}
	public Snake(  String name, double weight, double speed) {
		super(  name, weight, speed);
		 
	}
	/**
	 * override from the interface 
	 */
	@Override
	public void speedUp(int speed) {
	 
		if(speed+this.speed<MAX_SPEED) {
			this.speed+=speed;
		}
		
	}
	public String Sound() {
		 
		return "ssssssss";
	}
	
	
	
}
