
public class ProxyMain {

	public static void main(String[] args) {
		
		// ���� ������� �����ִ� ��ü
		BbsInterface bbs = new Bbs();
		System.out.println("Bbs:"+bbs.read());
		
		// ���� ������� �ΰ����� ���� �ϴ� Proxy ��ü
		BbsInterface bbsProxy = new BbsProxy();
		System.out.println("Proxy:"+bbsProxy.read());
	}

}
