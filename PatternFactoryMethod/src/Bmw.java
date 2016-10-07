
public class Bmw extends Car {

	public Bmw(String name) {
		super(name);
	}

	@Override
	public void setDestination(String from, String to) {
		setFrom(from);
		setTo(to);
	}

}
