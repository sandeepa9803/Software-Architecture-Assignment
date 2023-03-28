package design.pettern.command;

public class Test {

	public static void main(String[] args) {
		Light livingRoomLight = new LivingRoomLight();
        Light kitchenLight = new KitchenLight();

        Command livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        Command kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        livingRoomLightOnCommand.execute();
        livingRoomLightOffCommand.execute();
        kitchenLightOnCommand.execute();
        kitchenLightOffCommand.execute();

	}

}
