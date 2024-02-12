package Abstraction.com;

public abstract class Partial_Abstraction {

	public abstract void flowers();
	
	public abstract void trees();
	
	public void animals() {
		System.out.println("Animals");
	}
	
	public static void main(String[] args) {
		
		Partial_Abstraction PA = new Child_Partialabstraction();
		PA.animals();
		PA.flowers();
		PA.trees();
	}

}
