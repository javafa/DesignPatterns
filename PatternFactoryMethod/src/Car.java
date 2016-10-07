
public abstract class Car {
	
	private String name;
	private String from;
	private String to;
	
	public void setFrom(String from){
		this.from = from;
	}
	
	public void setTo(String to){
		this.to = to;
	}
	
	public Car(String name){
		this.name = name;
	}
	
	public abstract void setDestination(String from, String to);
	
	public void drive(){
		System.out.println(
			"I will drive to "+ to+" from "
			+from +" by "
			+name);
	}
}
