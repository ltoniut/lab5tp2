import java.util.Observable;
import java.util.Observer;

public class Mechanic implements Observer {
	private int id;
	private String name;
	
	
	public float CheckCar(Car c) {
		float i = 30;
		
		return i;
	}
	
	@Override
	public void update(Observable car, Object oldCar) {
		Car c = (Car) car;
		Car cPrime = (Car) oldCar;
		
		double price = 40;
		
		System.out.println("Auto " + c.getBrand() + " " + c.getModel() + " patente " + c.getPlate());
		
		System.out.println("Se revisó el aceite. El nivel de aceite es " + c.getOil());
		if (c.getOil() != cPrime.getOil()) {
			System.out.println("El nuevo nivel de aceite es " + cPrime.getOil());
			
			price += 20;
		}
		
		System.out.println("Se revisaron las llantas. El nivel de presión es " + c.getTirePressure());
		if (c.getTirePressure() != cPrime.getTirePressure()) {
			System.out.println("El nuevo nivel de presión es " + cPrime.getTirePressure());
			
			price += 20;
		}
		
		System.out.println("Se revisaró el agua. El nivel de agua es " + c.getWater());
		if (c.getWater() != cPrime.getWater()) {
			System.out.println("El nuevo nivel de agua es " + cPrime.getWater());
			
			price += 20;
		}
		
		System.out.println("El precio es " + price);
	}
}
