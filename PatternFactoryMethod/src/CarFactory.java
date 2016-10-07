
public class CarFactory {
	
	public static Car newInstance(String key){
		if(key.equals("포르쉐")){
			return new Porsche("파나메라");
		}else if(key.equals("BMW")){
			return new Bmw("530i");
		}else if(key.equals("볼보")){
			return new Volvo("볼보");
		}else{
			return null;
		}
	}
	
}
