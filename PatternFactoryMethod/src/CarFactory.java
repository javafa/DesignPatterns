
public class CarFactory {
	
	public static Car newInstance(String key){
		if(key.equals("������")){
			return new Porsche("�ĳ��޶�");
		}else if(key.equals("BMW")){
			return new Bmw("530i");
		}else if(key.equals("����")){
			return new Volvo("����");
		}else{
			return null;
		}
	}
	
}
