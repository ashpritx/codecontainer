
import java.util.*;


public class finderregex {

	public static void main(String[] args) {
		try {
			HashMap<String, Integer> score = new HashMap<String,Integer>();
			score.put("Fail",39);
			score.put("Third Class", 49);
			score.put("Second Class, Division 2",59);
			score.put("Second Class, Division 1",69);
			score.put("First Class",70);
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("What was your mark?");
			
			int mark = scan.nextInt();
			
			if(mark >100 && mark < 0) {
				System.out.println("Invalid Input: out of range.");
			}
			for(String i: score.keySet()) {
				if(mark< score.get(i)) {
					System.out.println("You got a "+i);
					break;
				}		
			}
		}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input, program terminating");
				
			
		}
	
	}	
}