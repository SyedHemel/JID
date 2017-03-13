package oca;

public class ForEach {

	public static void main(String[] args) {
		
		String[] items = {"Gloves","Trouser","T-shirt","Sneakers","Soaks"};
		
		System.out.println("Number of items to be purchased for gym: " + items.length);
		
		System.out.println("Purchased items are:");
		
		for(String item : items){
			
			System.out.print(item + "     ");
		}

	}

}
