package insurance;
public class index {			//index page
	
	public static void main(String[] args) {
		String option;
				
		users users =new users();
		display disp =new display();
		
		users.addUser();
		option=disp.option();

		while(option.equalsIgnoreCase("y")) {
			users.addUser();
			option=disp.option();
		}
		users.printU();
		System.out.println("-----END-----");
	
	}
}
