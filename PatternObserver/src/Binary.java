
class Binary implements Observer{
	public Binary(TargetJob t){
		t.attach(this);
	}
	@Override
	public void update(int msg) {
		System.out.print("Binary:"+Integer.toBinaryString(msg) + "       ");
	}
}