
public class Volvo extends Car {

	public Volvo(String name) {
		super(name);
	}

	@Override
	public void setDestination(String from, String to) {
		setFrom(from);
		setTo(to);
	}
}
