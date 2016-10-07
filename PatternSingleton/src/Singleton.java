
public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton(){ /* 생성을 못하게 막아준다 */ }

	public static Singleton getInstance(){
		return instance;
	}
	
}
