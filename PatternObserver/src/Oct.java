
class Oct implements Observer{
	public Oct(TargetJob t){
		// Ÿ�� �½�ũ�� ���� ����Ѵ�
		t.attach(this);
	}
	@Override // ��������� ������ Ÿ�������κ��� ȣ��Ǵ� �Լ�
	public void update(int msg) {
		System.out.print("Oct:"+Integer.toOctalString(msg) + "       ");
	}
}