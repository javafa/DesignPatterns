
public class FactoryMethodMain {
	
	public static void main(String[] args) {
		Car car1 = CarFactory.newInstance("BMW");
		car1.setDestination("����", "�Ǹ��ܹ븮");
		car1.drive();
		
		Car car2 = CarFactory.newInstance("������");
		car2.setDestination("����", "�Ǹ��ܹ븮");
		car2.drive();
	}
	
}
