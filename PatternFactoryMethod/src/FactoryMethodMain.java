
public class FactoryMethodMain {
	
	public static void main(String[] args) {
		Car car1 = CarFactory.newInstance("BMW");
		car1.setDestination("서울", "실리콘밸리");
		car1.drive();
		
		Car car2 = CarFactory.newInstance("포르쉐");
		car2.setDestination("서울", "실리콘밸리");
		car2.drive();
	}
	
}
