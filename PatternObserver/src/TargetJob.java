import java.util.ArrayList;

// 옵저버가 바라보고 있는 실행태스크
class TargetJob {
	// 현재 태스크를 바라보는 옵저버들을 등록해 두는 배열
	private ArrayList<Observer> observers = new ArrayList<>();
	int number = 0;
	// 옵저버를 등록해준다
	public void attach(Observer observer){
		observers.add(observer);
	}
	// 실행태스크에 값을 입력하고, 변경사항이 있음을 알리는 메서드를 호출한다
	public void setNumber(int n){
		number = n;
		notifyChanged();
	}
	// 실행태스크에 변경사항이 있으면 전체 옵저버에 알려준다
	private void notifyChanged(){
		for(Observer o : observers){
			o.update(number);
		}
	}
}