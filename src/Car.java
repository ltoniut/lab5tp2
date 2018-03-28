import java.util.Observable;

public class Car extends Observable {
	private int id;
	private String brand;
	private String model;
	private String plate;
	

	private float oil;
	private float tirePressure;
	private float water;
	
	float maxWater = 30;
	float maxPressure = 20;
	float maxOil = 40;
	
	public Car(float oilParam, float waterParam, float pressureParam, String modelParam, String brandParam, String plateParam) {
		this.oil = oilParam;
		this.water = waterParam;
		this.tirePressure = pressureParam;
		
		this.model = modelParam;
		this.brand = brandParam;
		this.plate = plateParam;
	}
	
	public Car(Car old) {
		this.oil = old.oil;
		this.water = old.water;
		this.tirePressure = old.tirePressure;
		
		this.brand = old.brand;
		this.model = old.model;
		this.plate = old.plate;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlate() {
		return plate;
	}
	public float getOil() {
		return oil;
	}
	public void setOil(float oil) {
		this.oil = oil;
	}
	public float getTirePressure() {
		return tirePressure;
	}
	public void setTirePressure(float tirePressure) {
		this.tirePressure = tirePressure;
	}
	public float getWater() {
		return water;
	}
	public void setWater(float water) {
		this.water = water;
	}
	
	public void repairAll() {
		Car updated = new Car(this);
		
		if (this.oil < this.maxOil/2) {
			updated.oil = this.maxOil;
		}
		if (this.tirePressure < this.maxPressure/2) {
			updated.tirePressure = this.maxPressure;
		}
		if (this.water < this.maxWater/2) {
			updated.water = this.maxWater;
		}
		
		this.setChanged();
		
		this.notifyObservers(updated);
	}
}
