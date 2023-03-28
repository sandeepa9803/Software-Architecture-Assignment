package design.pettern.abstractFactory;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
		System.out.println("0");
	}

}
