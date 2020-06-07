
package system;

import Olympics.*;
import mobility.*;
import animals.*;
import java.io.*; 
import java.util.Scanner;

/**
 * 
 * @author Ayman Abodolrhman 
 * ID:311549737     ï
 *
 */
public class System {

	public enum type{ bronze , silver , gold } ; 
	 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(java.lang.System.in);
		Animal [] ani ;
		int numAnimals ,i,choiceType,choiceAnimal; 
		double speed,weight;
		String name;
	
		java.lang.System.out.print("How much animals you want to create in the game: ");
		numAnimals = in.nextInt();
		ani =new Animal[numAnimals];
	/**
	 * start the game  
	 */
		for (i=0;i<numAnimals;i++) {
			java.lang.System.out.print("please choose what the type of the animal number :["+i+"] "
					+ "\n1.Air Animal\n2.Water Animal\n3.Terrestrial Animals\nYour choice:");
			choiceType = in.nextInt();
			
			java.lang.System.out.print("Animal Name: ");
			name= in.nextLine();
			name= in.nextLine();
			
			java.lang.System.out.print("Animal speed: ");
			speed= in.nextDouble();
			
			java.lang.System.out.print("Animal weight: ");
			weight= in.nextDouble();
			
			switch(choiceType){
			case 1:{
				java.lang.System.out.print("please choose which animal you want : \n"
						+ "1.Eagle\n2.Pigeon\nYour choice:");
				choiceAnimal=in.nextInt();
				
				switch(choiceAnimal) {
				case 1: 
					ani[i]=new Eagle(name,weight,speed);
					break;
				case 2:
					ani[i]=new Pigeon(name,weight,speed);
					break;
				
				}
				break;
			}//case1
			case 2:{
				java.lang.System.out.print("please choose which animal you want : \n"
						+ "1.Alligator\n2.Whale\n3.Dolphin\nYour choice:");
				choiceAnimal=in.nextInt();
				
				switch(choiceAnimal) {
				case 1: 
					ani[i]=new Alligator(name,weight,speed);
					break;
				case 2:
					ani[i]=new Whale(name,weight,speed);
					break;
				case 3:
					ani[i]=new Dolphin(name,weight,speed);
					break;
					}
				break;
				}//case2
			case 3:{
				java.lang.System.out.print("please choose which animal you want : \n"
						+ "1.Dog \n2.Cat \n3.Snake \nYour choice:");
				choiceAnimal=in.nextInt();
				
				switch(choiceAnimal) {
				case 1: 
					ani[i]=new Dog(name,weight,speed);
					break;
				case 2:
					ani[i]=new Cat(name,weight,speed);
					break;
				case 3:
					ani[i]=new Snake(name,weight,speed);
					break;
					}
				break;
			}
				
		}//switch
			
			
	}//for
	 
		do {
		java.lang.System.out.print("For information off the animal press 1\n"
				+ "for the sounds press 2 \n3.Exit\nPress:"); 
		choiceType = in.nextInt();
		switch(choiceType) {
			case 1:{
				for(i=0;i<numAnimals;i++) {
					java.lang.System.out.println (ani[i].toString());
				}
			}
			break;
			case 2 : {
				for(i=0;i<numAnimals;i++) {
					 ani[i].makeSound();
				}
			}
			break;
			 
			}
		}while(choiceType!=3);
			 
		

		
	
	}//void main

	
}
