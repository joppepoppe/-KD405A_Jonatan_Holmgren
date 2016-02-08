package se.mah.ke.k3lara;

public class Bike {
	
	private static String color;
	private static int price;
	private static int size;
	
	public Bike(String color, int size){
		Bike.color=color;
		Bike.size=size;
	}
	public Bike(String color, int size, int price){
		for(int p = 0; p< Constants.colorArray.length; p++ ){
			
			
			if(BikeGuUI.textColor.getText().equals(Constants.colorArray[p])) {
							
			    Constants.color1=Constants.colorArray[p];
			    Constants.test1=true;
			    break;
			    
			} else {
				Constants.test1=false;
			}
			
		
		}
		
		if(Constants.test1==true) {
			System.out.println("Du har valt färgen " + Constants.color1);
			Bike.color=color;
		} else if (Constants.test1==false) {
			System.out.println("du har valt fel färg");
			Bike.color="wrong color";
			}
		
		
		if (size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE) {

			Bike.size = size;

		} else {
			
			Bike.size = 0;

		}

		if (price >= Constants.MIN_PRICE && price <= Constants.MAX_PRICE) {
	

			Bike.price = price;

		} else {

			Bike.price = 0;
		}
		
		
		
		
		
		
	}
	
	
	
	public static String getColor() {
		return color;
	}
	public static int getSize() {
		return size;
	}
	public static int getPrice() {
		return price;
	}
	public static void setPrice(int newPrice) {
		price=newPrice;
	}
	
}
