
public interface Observer{
	// 변경사항이 있으면 타겟잡으로부터 호출되는 함수
	public abstract void update(int msg);
}