package Olympics;


/**
 * set the type of the medal 
 * @author איימן
 *
 */
public class Medal {

	
	public enum type1{ bronze , silver , gold } ; 
	private String tournament ; 
	private int year ;
	 private type1 type;

	public Medal(String tour , int year , String color) {
		setType(color);
		this.tournament=tour;
		this.year=year;
	}

/**
 * the type of medal 
 * @param color
 * @return
 */
	public boolean setType(String color) {
		
		switch(color){
			case "bronze":{
				type=type1.bronze;
				return true;
			}
		
			case "silver":{
				type=type1.silver;
				return true;
			}
			case "gold":{
				type=type1.gold;
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "type:["+type.toString()+"] tournament:["+tournament+"] year:["+year+"]"  ;
	}
	
	
}
