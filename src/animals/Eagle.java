package animals;

import mobility.Point;

/**
 * eagle class 
 * @author איימן
 *
 */
public class Eagle extends AirAnimal {

	private double altitudeOfFlight ;
 
	
	private static  final  int  MAX_ALTITUDE = 1000 ;

	
	public Eagle(Point location, String name, double weight, double speed) {
		super(location, name, weight, speed);
		
	}
	public Eagle( String name, double weight, double speed) {
		super( name, weight, speed);
		
	}
	 /**
	  * his sound 
	  */
	public String Sound() {
		 
		return "Clack-wack-chack";
	}

}
