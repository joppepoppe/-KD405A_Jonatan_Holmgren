package se.mah.ke.k3lara;
public class Human {
	private String name;
	private Dog dog;

	public Human(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public Dog buyDog(Dog Indog){
		dog = new Dog(" ");
		dog = Indog;
		return dog;
	}
	public String infoPrint(String name){
		if(dog == null){
			String line = name + " has no dog";
			return line;
		}else
		{
			String line = name + " has a dog named " + dog.getName();
			return line;
		}
	}
}
