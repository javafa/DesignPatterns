
class Hex implements Observer{
	public Hex(TargetJob t){
		// Ÿ�� �½�ũ�� ���� ����Ѵ�
		t.attach(this);
	}
	@Override // ��������� ������ Ÿ�������κ��� ȣ��Ǵ� �Լ�
	public void update(int msg) {
		System.out.print("Hex:"+Integer.toHexString(msg) + "       ");
	}
}