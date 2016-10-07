
public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton(){ /* ������ ���ϰ� �����ش� */ }

	public static Singleton getInstance(){
		return instance;
	}
	
}
