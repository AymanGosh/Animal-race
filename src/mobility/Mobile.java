package mobility;
import java.lang.Math.*;


 /**
  * mobile the base class for the animals 
  * @author איימן
  *
  */

public abstract  class  Mobile implements ILocatable {

	protected Point location ;   // Current location
	protected double totalDistance=0 ; // Distance the object traveled, [>0]
	
	public Mobile(Point location ) {
		
		setLocation(location);
	 
		
	}
	public Mobile(  ) {
			
			this.location=new Point(); 
	}


	public Point getLocation() {
		return location;
	}


/**
 * set new location 
 */
	public boolean setLocation(Point location) {
		
		if(location.setXandY(location.getX() ,location.getX())) {
			this.location = new Point(location.getX(),location.getY());
			return true;
		}else
			return false;
			 
	}


/**
 * set the new dis 
 * @param totalDistance
 * @return
 */
	public boolean setTotalDistance(double totalDistance) {
		
		if(totalDistance>0) {
			this.totalDistance = totalDistance;
			return true;
		}
		else 
			return false;
	}
	
	public double getTotalDistance() {
		return totalDistance;
	} 
	
	public void addTotalDistance(double dis){//increases t d after movement
		
		setTotalDistance(dis+this.getTotalDistance());
		
		
	}
	/**
	 * calc how much new total dis from another point 
	 * @param obj
	 * @return
	 */
	public double calcDistance(Point obj) {
		
		int x1,x2,y1,y2;
		
		 x1=this.location.getX();
		 x2= obj.getX();
		 y1=this.location.getY();
		 y2=obj.getY();
		 
//		System.out.println(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
		
		 return (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));	 	 
	}
	/**
	 * change the point to new point 
	 * @param p
	 * @return
	 */
	public double move(Point p ) {
		
		double temp;
		temp=this.calcDistance(p);
		this.addTotalDistance(temp);
		this.location.setXandY(p.getX(), p.getY());
		
		return this.totalDistance;
	}
	/**
	 * print info 
	 */
	public String toString() {
		return this.location.toString()+" Total-Distance:["+totalDistance+"]";
	}
	
	



	
	

}
