
public class ClassFacade {
	Door door = new Door();
	Light light = new Light();
	Computer com = new Computer();

	public void start(){
		//수업을 시작
		System.out.println("--- 수업을 시작합니다 ---");
		door.open();
		light.turnOn();
		com.turnOn();
	}
	
	public void end(){
		//수업을 종료
		System.out.println("--- 수업을 종료합니다 ---");
		com.turnOff();
		light.turnOff();
		door.close();
	}
}
