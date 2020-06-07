package animals;

import mobility.Point;
/**
 * water animal class extend from animal 
 * @author איימן
 *
 */
public  class WaterAnimal extends Animal {

	protected static final int   MAX_DIVE = -800 ; 
	protected	double  diveDept ;
	
	public WaterAnimal(Point location, String name, double weight, double speed) {
		super(location, name, weight, speed);
	}
	public WaterAnimal( String name, double weight, double speed) {
		super( name, weight, speed);
		this.location=new Point(50,0);
	}
	/**
	 * dive not more than the max number 
	 * @param div
	 * @return
	 */
	 public boolean Dive(double div) {
		 if(this.diveDept-div>MAX_DIVE) {
			 this.diveDept-=div;
			 return true;
		 }else
			 return false;
	 }

	@Override
	public String Sound() {
		// TODO Auto-generated method stub
		return null;
	}

 
	
   
}
