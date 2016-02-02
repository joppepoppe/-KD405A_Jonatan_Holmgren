package se.mah.ke.k3lara;

public class Bike {
	
	private String color;
	private int price;
	private int size;
	

	public Bike(String color, int size) {
		this.color=color;
		this.size=size;
	}
	public Bike(String color, int size, int price) {
		this.color=color;
		this.size=size;
		this.price=price;
	}
	
	public String getColor() {
		return this.color;
	}
	public int getSize() {
		return this.size;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
}
