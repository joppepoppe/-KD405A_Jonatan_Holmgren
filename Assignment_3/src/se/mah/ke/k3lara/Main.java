package se.mah.ke.k3lara;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		int count=0;
		ArrayList<Bike> bikeArmy = new ArrayList<Bike>();
		
		bikeArmy.add(new Bike("röd",10,100));
		bikeArmy.add(new Bike("röd",11,10));
		bikeArmy.add(new Bike("röd",12,10));
		bikeArmy.add(new Bike("röd",13,10));
		bikeArmy.add(new Bike("röd",14,10));
		bikeArmy.add(new Bike("röd",15,10));
		bikeArmy.add(new Bike("röd",16,10));
		bikeArmy.add(new Bike("röd",17,10));
		bikeArmy.add(new Bike("röd",18,10));
		bikeArmy.add(new Bike("röd",19,10));
		bikeArmy.add(new Bike("röd",20,10));
		bikeArmy.add(new Bike("röd",10,10));
		
		for (int i = 0; i < bikeArmy.size(); i++) {
			System.out.println("nr:" + (count++) + " " + bikeArmy.get(i).getColor() + " " + bikeArmy.get(i).getSize()
					+ " " + bikeArmy.get(i).getPrice());
			
		}
	

	}

}
