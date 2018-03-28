
public class Main {
	
	public static void main(String[] args) {		
		Mechanic m = new Mechanic();
		
		Car first = new Car(15, 20, 7, "600", "Fiat", "ABC 123");
		Car second = new Car(30, 20, 30, "Accord", "Honda", "DEF 456");
		Car third = new Car(30, 2, 15, "70", "Rastrojero", "GHI 789");
		
		first.addObserver(m);
		
		second.addObserver(m);
		
		third.addObserver(m);

		first.repairAll();
		second.repairAll();
		third.repairAll();
	}
}
