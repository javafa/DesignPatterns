/*
 * ���Ͻ� ������ ���� ȣ���ϰ��� �ϴ� ��ü�� ������� �״�� ������ü
 * �ΰ����� ������ ���ش�
 */
public class BbsProxy implements BbsInterface {
	Bbs bbs;
	
	public BbsProxy(){
		bbs = new Bbs();
	}
	
	@Override
	public String read() {
		System.out.println("Proxy:��ȸ���� 1 �����Ǿ����ϴ�");
		return bbs.read();
	}
}
