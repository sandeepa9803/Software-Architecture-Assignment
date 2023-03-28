package design.pattern.command;

public class Coffee extends Beverages  {

	@Override
	void brew() {
		// TODO Auto-generated method stub
	    System.out.println("Stripping coffie through filter.");
	    }

	

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub

		System.out.println("Add suger and milk.");
	}
	
	

}
