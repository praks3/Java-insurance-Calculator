package insurance;
import java.util.*;

public class users {
	public String model;
	public String carType;
	public double price;
	public String insuranceType;
	
	Scanner sc= new Scanner(System.in);
	ArrayList<details> user =new ArrayList<>();
	CalcInsurance calc= new CalcInsurance();
	
	public void addUser() {	
		System.out.print("-car model:	");
		model=sc.nextLine();
		System.out.print("-car type:	");
		carType=sc.nextLine();
		System.out.print("-price:		");
		price=sc.nextDouble();
		sc.nextLine();
		System.out.print("-insurance Type:");
		insuranceType=sc.nextLine();
		user.add(new details(model,carType,price,insuranceType));
	}
	
		public void printU() {
		for(details details: user) {
	
				System.out.println("-------------------------");
				System.out.println("CAR MODEL:	"+details.getModel());
				System.out.println("PRICE:		"+details.getPrice());
				System.out.println("TOTAL INSURANCE:"+String.format("%.0f",
						calc.totalInsurance(details.getModel(),details.getCarType(), details.getPrice(), details.getInsuarnceType())));			
		}
	}
}
