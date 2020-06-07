package animals;
import mobility.*;
import Olympics.*;
import Olympics.Medal.type1;


/**
 * 
 * @author איימן
 *this class for the animal extend the mobile 
 */

public abstract class Animal extends Mobile  {

	protected String Name;
	protected enum gender1 {Male, Female, Hermaphrodite};
	gender1 gender;
	protected double weight ;
	protected double speed ;
	protected Medal [] medals;
	protected int numMedals;

	
	public Animal(Point location, String name, double weight, double speed ) {
		super(location);
		 Set( name,  weight,  speed) ;
		 
	}
	public Animal( String name, double weight, double speed ) {
		Set( name,  weight,  speed) ;
		 
	}
	/**
	 * set the gender 
	 * @param gen
	 * @return
	 */
	public boolean setGender(String gen) {
		
		switch(gen){
		case "Male":{
			gender=gender1.Male;
			return true;
		}
	
		case "Female":{
			gender=gender1.Female;
			return true;
		}
		case "Hermaphrodite":{
			gender=gender1.Hermaphrodite;
			return true;
		}
	}
	return false;
	}
	/**
	 * set the parmters 
	 * @param name
	 * @param weight
	 * @param speed
	 */
	public void Set( String name, double weight, double speed) {
		Name = name;
		this.weight = weight;
		this.speed = speed;
		this.numMedals=0;
	}
	public void  makeSound() {
		java.lang.System.out.println("Animal:["+this.Name+ "] said:["+this.Sound()+"]");
		
	} 
	/**
	 * make the sounds 
	 */
	
	public String toString() {
		
		return "Class Name:[" +this.getClass().getSimpleName()+"] Name:["+Name + "] weight:[" +
		weight +"] Speed:["+speed+ "] "+super.toString();
		
	}
	public abstract String  Sound();
	
}
