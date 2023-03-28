package design.pettern.command;

public class LivingRoomLight implements Light {

	@Override
	public void on() {
		System.out.println("Switch on() Living Room Light");

	}

	@Override
	public void off() {
		System.out.println("Switch off() Living Room Light");

	}

}
