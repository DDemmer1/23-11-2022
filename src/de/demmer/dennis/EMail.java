package de.demmer.dennis;

public class EMail {
	
	private String text;
	private String sender;
	private String recipient;
	
	//Konstruktor 
//	public EMail(String absender) {
//		System.out.println(absender);
//		sender = absender;
//	}
	

	public EMail(String sender, String text) {
		this.sender = sender;
		this.text = text;
		convertNameToEmail("Max", "Mustermann");
	}
	
	
	public EMail(String sender) {
		this.sender = sender;
	}
	
	
	public EMail() {
		
		
	}
	
	
	
	
	// public private protected 
	private  String convertNameToEmail(String vorname, String nachname) {
		
		//DO STUFF
		
		return vorname + "." + nachname + "@web.de";
		
	}
	
	
	
	public void test() {
		
		convertNameToEmail("asd", "sadfd");
	}
	



}
