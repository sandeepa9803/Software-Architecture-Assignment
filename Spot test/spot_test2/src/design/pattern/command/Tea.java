package design.pattern.command;

   public class Tea extends Beverages {

	    @Override
	    void brew() {
	        System.out.println("Steeping the Tea.");
	    }

	    @Override
	    void addCondiments() {
	        System.out.println("Adding Lemon.");
	    }
	}


