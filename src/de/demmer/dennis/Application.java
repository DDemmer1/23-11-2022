package de.demmer.dennis;

public class Application {
	
	
	
	
	public static void main(String[] args) {
		
		
		EMail email0 = new EMail("Max.Mustermann@web.de", "Das ist ein Text");
		
		EMail email1 = new EMail("Dennis.Demmer@web.de");

		
//		System.out.println(email0.sender);
//		System.out.println(email0.text);
	
		
		
		//Die EMail Klasse hat so wie alles Klassen "Object" als Überklasse
		System.out.println(email0.hashCode());
		System.out.println(email1.hashCode());
		
		
		
//		email1.convertNameToEmail("Test","Name");
		
		
		
		
		
		Item item = new Item();
		
//		item.price = -20.0;
		
		item.setPrice(50.50);
		
		System.out.println(item.getPrice());
		
	
		
		
		

	}
	
	
	



}
