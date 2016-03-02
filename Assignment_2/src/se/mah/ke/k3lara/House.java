package se.mah.ke.k3lara;

public class House {
	private int yearBuilt;
	private int size;
	private static int minSize = 10;
	private static int maxSize = 1000;
	private static int minYear = 1800;
	private static int maxYear = 2015;

	public House(int yearBuilt, int size) {
		if(yearBuilt >= minYear && yearBuilt <= maxYear) {
		this.yearBuilt = yearBuilt;
		this.size = size;
		} else {
			this.yearBuilt=0;
			this.size=0;
		}
		
	}

	public int getYearBuilt() {
		return this.yearBuilt;
	}

	public int getSize() {
		
		return this.size;
	}
	
	public static int getMaxYear() {
		return maxYear;
	}
	
	public static int getMinYear() {
		return minYear;
	}
	
	public static int getMinSize(){
		return minSize;
	}
	public static int getMaxSize() {
		return maxSize;
	}
	}
	


