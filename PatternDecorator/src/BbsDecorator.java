/*
 * 프록시 패턴은 실제 호출하고자 하는 객체의 결과값을 전달하는데
 * 부가적인 동작이 결과값에 영향을 미칩니다
 */
public class BbsDecorator implements BbsInterface {
	Bbs bbs;
	@Override
	public String read() {
		bbs = new Bbs();
		
		return bbs.read() + " 메롱~";
	}

}
