
public class Porsche extends Car {

	public Porsche(String name) {
		super(name);
	}

	@Override
	public void setDestination(String from, String to) {
		setFrom(from);
		setTo(to);
	}

}
