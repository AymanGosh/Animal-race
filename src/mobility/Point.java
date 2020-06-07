package mobility;
/**
 * point class for the movie 
 * @author איימן
 *
 */
public class Point {
	private int x,y;

	public Point(int x, int y) {
		//if(x>=0 && y >=0) {
			this.x = x;
			this.y = y;
		//}
			
	}
	public Point( ) {
		this.x = 0;
		this.y = 0;
	}
	

	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * set new 2 points 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean setXandY(int x , int y) {
		
		setX(x);
		setY(y);
		return true;
	}
 
	
	
	public int getY() {
		return y;
	}
	
	public int getX() {
		return x;
	}

	public String toString() {
		return "Point("+x+","+y+")";
	}

	
	
	
}
