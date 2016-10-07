
public class StrategyMain {

	public static void main(String[] args) {
		
		StrategyInterface strategy = null;
		
		// 1. ������ ����� ��ü�� ���ؽ�Ʈ�� ����
		Context context = new Context();
		
		// 2. ������ ����
		strategy = new Punch();
		// 3. ������ Context�� ������ ���
		context.runContext(strategy);
		
		strategy = new Kick();
		context.runContext(strategy);
		
		strategy = new Run();
		context.runContext(strategy);
	}

}
