package design.pettern.abstractFactory;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
		System.out.println("##########");
		System.out.println("#        #");
		System.out.println("#        #");
		System.out.println("#        #");
		System.out.println("##########");
	}

}
