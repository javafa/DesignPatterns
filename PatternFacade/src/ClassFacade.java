
public class ClassFacade {
	Door door = new Door();
	Light light = new Light();
	Computer com = new Computer();

	public void start(){
		//������ ����
		System.out.println("--- ������ �����մϴ� ---");
		door.open();
		light.turnOn();
		com.turnOn();
	}
	
	public void end(){
		//������ ����
		System.out.println("--- ������ �����մϴ� ---");
		com.turnOff();
		light.turnOff();
		door.close();
	}
}
