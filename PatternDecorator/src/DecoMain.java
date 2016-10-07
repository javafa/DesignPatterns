
public class DecoMain {

	public static void main(String[] args) {
		BbsInterface bbs = new Bbs();
		System.out.println("Bbs:"+bbs.read());
		
		BbsInterface bbsDeco = new BbsDecorator();
		System.out.println("bbsDeco:"+bbsDeco.read());

	}
}
