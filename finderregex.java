import java.util.*;


public class fff {

	public static void main(String[] args) throws NullPointerException{
		try {
			LinkedHashMap<Integer, String> score = new LinkedHashMap<Integer,String>();
			score.put(70, "First class");
			score.put(59, "Second Class, Division 1");
			score.put(49, "Second Class, Divison 2");
			score.put(39, "Third Class");
			
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("What was your mark?");
			
			int mark = scan.nextInt();
			
			if(mark >100 && mark < 0) {
				System.out.println("Invalid Input: out of range.");
			}
			for(Integer i: score.keySet()) {
				if(mark <= 39) {
					System.out.println("You got a Fail");
					System.exit(0);
				}
				if(mark>=i) {
					System.out.println("You got a "+score.get(i));
					break;
				}

					
				}
				
				
		}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input, program terminating");
				
			
		}
	
	}	
}
