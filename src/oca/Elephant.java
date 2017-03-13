package oca;

public class Elephant extends Mammal {
	
	public Elephant(){
		super(2);
		System.out.println("Elephant - constructor");
	}

	public static void main(String[] args) {

		new Mammal(5);

	}

}

class Mammal {
	
	public Mammal(int age){
		System.out.println("Mammal");
	}
	
}
