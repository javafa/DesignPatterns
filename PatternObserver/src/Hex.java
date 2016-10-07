
class Hex implements Observer{
	public Hex(TargetJob t){
		// 타겟 태스크에 나를 등록한다
		t.attach(this);
	}
	@Override // 변경사항이 있으면 타겟잡으로부터 호출되는 함수
	public void update(int msg) {
		System.out.print("Hex:"+Integer.toHexString(msg) + "       ");
	}
}