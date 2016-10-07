import java.util.ArrayList;

// �������� �ٶ󺸰� �ִ� �����½�ũ
class TargetJob {
	// ���� �½�ũ�� �ٶ󺸴� ���������� ����� �δ� �迭
	private ArrayList<Observer> observers = new ArrayList<>();
	int number = 0;
	// �������� ������ش�
	public void attach(Observer observer){
		observers.add(observer);
	}
	// �����½�ũ�� ���� �Է��ϰ�, ��������� ������ �˸��� �޼��带 ȣ���Ѵ�
	public void setNumber(int n){
		number = n;
		notifyChanged();
	}
	// �����½�ũ�� ��������� ������ ��ü �������� �˷��ش�
	private void notifyChanged(){
		for(Observer o : observers){
			o.update(number);
		}
	}
}