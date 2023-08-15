package insurance;
//calculating insurance
public class CalcInsurance  {
	double insuranceAmt=0.0d;
	public double totalInsurance(String model,String carType,double price,String insuranceType) {
		insuranceAmt=0.0;
		try {
			if(price<=0)
				throw new ArithmeticException("price should be greater than 0");
			  if (model.equals("") || carType.equals("") || insuranceType.equals("")) 
	              throw new IllegalArgumentException("Missing required input");
			  if(!insuranceType.equalsIgnoreCase("basic")&&!insuranceType.equalsIgnoreCase("premium")) 
				  throw new IllegalArgumentException("INVALID INSURANCE TYPE");  
			  
		switch(carType) {
		 case "Hatchback":
             insuranceAmt = price * 0.05;
             break;
         case "Sedan":
        	 insuranceAmt = price * 0.08;
             break;
         case "SUV":
        	 insuranceAmt = price * 0.1;
             break;
          default:
        	  throw new IllegalArgumentException("INVALID CAR TYPE");
		}
	if(insuranceType.equalsIgnoreCase("premium"))
		insuranceAmt*=1.2;
		}
		finally {
			
		}
	return insuranceAmt;
	}
}