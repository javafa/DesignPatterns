
public class StrategyMain {

	public static void main(String[] args) {
		
		StrategyInterface strategy = null;
		
		// 1. 전략을 사용할 주체인 컨텍스트를 생성
		Context context = new Context();
		
		// 2. 전략을 선택
		strategy = new Punch();
		// 3. 전략을 Context에 주입후 사용
		context.runContext(strategy);
		
		strategy = new Kick();
		context.runContext(strategy);
		
		strategy = new Run();
		context.runContext(strategy);
	}

}
