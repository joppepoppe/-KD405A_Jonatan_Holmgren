package se.mah.ke.k3lara;
public abstract class Mammals extends Animal{
	protected int gestationTime;
	public Mammals(String latinName, int gestationTime) {
		super(latinName);
		this.gestationTime = gestationTime;
	}
	public int getGestationTime(){
		return this.gestationTime;
	}
}
