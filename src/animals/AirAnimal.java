package animals;

import mobility.Point;

/**
 *  this class for air animal 
 * @author איימן
 *
 */
public  class AirAnimal extends Animal {

	protected double wingspan  ;
	
	public AirAnimal(Point location, String name, double weight, double speed) {
		
		super(location, name, weight, speed);
		 
	}
	/**
	 * constrctor with put point 
	 * @param name
	 * @param weight
	 * @param speed
	 */
	public AirAnimal(String name, double weight, double speed) {
		super( name, weight, speed);
		this.location=new Point(0,100);
	}
	public double getWingspan() {
		return wingspan;
	}
	public boolean setWingspan(double wingspan) {
		if(wingspan>0) {
			this.wingspan = wingspan;
			return true;
		}else 
			return false;
	}
	/**
	 * to print 
	 */
	public String toString() {
		return super.toString()+" wingspan:["+wingspan+"]";
	}
	/**
	 * this help make the sound
	 */
	@Override
	public String Sound() {
		// TODO Auto-generated method stub
		return null;
	}
 
	 
	 
}
