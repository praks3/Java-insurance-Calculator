package insurance;
import java.util.*;
public class display {				//for displaying choice
	
	public static String option;
	public String option() {
		Scanner sc=new Scanner(System.in);
		System.out.println("DO YOU WANT TO ADD MORE CARS? (Y/N):");
		option=sc.nextLine();
		//sc.close();
		return option;
	}
}
