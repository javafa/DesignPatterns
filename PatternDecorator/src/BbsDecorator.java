/*
 * ���Ͻ� ������ ���� ȣ���ϰ��� �ϴ� ��ü�� ������� �����ϴµ�
 * �ΰ����� ������ ������� ������ ��Ĩ�ϴ�
 */
public class BbsDecorator implements BbsInterface {
	Bbs bbs;
	@Override
	public String read() {
		bbs = new Bbs();
		
		return bbs.read() + " �޷�~";
	}

}
