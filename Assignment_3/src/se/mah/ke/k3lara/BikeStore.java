package se.mah.ke.k3lara;

import java.util.ArrayList;

public class BikeStore {
	
	private static ArrayList<Bike> bikeStore = new ArrayList<Bike>();
	
	public static String getAllBikes() {

		String returnString=" ";
		for (int i = 0; i < bikeStore.size(); i++) {
			
			bikeStore.get(i);
			returnString += ("bikes " + (i + 1) + " is " + Bike.getSize() +"" + " inches,  "+ "\n"+ "has the color "
					+ Bike.getColor() + "\n" + "and costs " + Bike.getPrice() + " dollars" + "\n");
			System.out.println(Bike.getColor());
		}
		
		return returnString;
	}
	
	
	public static void addBike(String color, int size, int price) {
		bikeStore.add(new Bike(color, size, price));
		
		
		
	}


}
