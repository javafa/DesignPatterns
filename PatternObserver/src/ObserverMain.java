import java.util.Scanner;
public class ObserverMain {
	public static void main(String[] args) {
		TargetJob target = new TargetJob();
		new Binary(target);
		new Hex(target);
		new Oct(target);
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("\nEnter a Number :");
			target.setNumber(scan.nextInt());
		}
	}
}









