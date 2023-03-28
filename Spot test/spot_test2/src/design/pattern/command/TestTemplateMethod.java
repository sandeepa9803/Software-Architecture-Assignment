package design.pattern.command;

public class TestTemplateMethod {
	
	static Beverages beverage = null;
	
	public static void main (String[] args) {
		
		Beverages tea = new Tea ();
		tea.prepareRecepie();
		System.out.println("================================");
		Beverages Coffee = new Coffee ();
		Coffee.prepareRecepie();
		
	}

}
