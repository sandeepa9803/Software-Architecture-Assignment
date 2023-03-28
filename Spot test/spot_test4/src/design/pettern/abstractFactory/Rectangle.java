package design.pettern.abstractFactory;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
		System.out.println("##################");
		System.out.println("#                #");
		System.out.println("#                #");
		System.out.println("#                #");
		System.out.println("##################");
	}

}
