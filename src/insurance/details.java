package insurance;
public class details {
	private String model;
	private String carType;
	private double  price ;
	private String insuranceType;
	
	public details(String model, String carType, double price, String insuranceType) {
		this.model=model;
		this.carType=carType;
		this.price=price;
		this.insuranceType=insuranceType;
	}
	public String getModel() {
		return model;
	}
	public String getCarType() {
		return carType;
	}
	public String getInsuarnceType() {
		return insuranceType;
	}
	public double getPrice() {
		return price;
	}
	
}
	


