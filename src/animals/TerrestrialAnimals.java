package animals;

import mobility.Point;

/**
 * this type of animal extend from animal class 
 * @author איימן
 *
 */
public  class TerrestrialAnimals extends Animal {

	protected int noLegs;
	
	public TerrestrialAnimals(Point location, String name, double weight, double speed) {
		super(location, name, weight, speed);
		// TODO Auto-generated constructor stub
	}
	public TerrestrialAnimals( String name, double weight, double speed) {
		super(  name, weight, speed);
		this.location=new Point(0,20);
	}
	
	/**
	 * this sound of animal 
	 */
	@Override
	public String Sound() {
		// TODO Auto-generated method stub
		return null;
	}

}
