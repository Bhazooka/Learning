package csc2a.models.rover;

import csc2a.models.E_PLANET;


public class MarsRover extends Rover implements RoverVehicle{

    private int numWheels;
    private int numArms;

    int NUM_WHEELS = 4;
    int NUM_ARMS = 2;

    //constructor
    public MarsRover(E_PLANET Planet, boolean hasArmourPlating, boolean hasWeaponMounts) {
        super(Planet, hasArmourPlating, hasWeaponMounts);
        this.numWheels = NUM_WHEELS;
        this.numArms = NUM_ARMS;
    }

    //Getters and Setters
    public int getNumWheels(){
        return this.numWheels;
    }

    public int getNumArms(){
        return this.numArms;
    }

    /*
    public void setNumWheels(int newNumWheels){
        this.numWheels = newNumWheels;
    }

    public void setNumArms(int newNumArms){
        this.numArms = newNumArms;
    }
     */

    public void setNumWheels(int NumWheels){
        this.numWheels = NumWheels;
    }

    public void setNumArms(int NumArms){
        this.numArms = NumArms;
    }

    
    //Implemented method from RoverVehicle to be Overriden
    @Override
    public void drive() {
        System.out.printf("""
                        Rover Type: Mars Rover \n
                        Has Armour Plating \t: %s
                        Has Weapon Mounts \t: %s
                        Number of wheels \t: %d
                        Number of arms \t\t: %d
                        """,
                this.hasArmourPlating, this.hasWeaponMounts, this.numWheels, this.numArms);
    }
    

    /*
    //Implemented method from RoverVehicle to be Overriden
    @Override 
    public void drive() {
		System.out.println("Rover type: Earth Traveler");
		System.out.println("Armour Plating: " + this.hasArmourPlating);
		System.out.println("Weapon Mounts: " + this.hasWeaponMounts);
		System.out.println("Number of Arms: " + this.numArms);
		System.out.println("Number of Wheels: " + this.numWheels);
	}
	*/


}
