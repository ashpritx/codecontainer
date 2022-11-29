package tutorial3;

public class tutorial3 {

	public static void main(String[] args) {
		
		double rolledSix1 = 0;
		double rolledSix2 = 0;
		Die die1 = new Die();
		Die die3 = new Die();
		Die die2 = new Die();
		
		for(int h = 0; h < 100000; h++) {
			for(int i = 0; i <4; i++) {
			
				die1.roll();
			
				if(die1.outcome==6) {
				
					rolledSix1++;
				}
				
			}
			
			for(int j = 0; j<24;j++) {
			
				die2.roll();
				die3.roll();
			
				if(die2.outcome == 6 && die3.outcome==6) {
					rolledSix2++;
				
				}
		
			}
			
		}
		
		double prob1 = rolledSix1/(4*100000);
		double prob2 = rolledSix2/(24*100000);
		
		if (prob1>prob2) {
			
			System.out.println("rolling at least one six in four throws of a die - "+prob1);
			System.out.println("rolling at least 2 six in 24 throws of 2 die - "+prob2);
			System.out.println("\r rolling at least one six in four throws of a single die is more likely");
		}
		else if (prob2>prob1) {
			System.out.println("rolling at least one six in four throws of a die - "+prob1);
			System.out.println("rolling at least 2 six in 24 throws of 2 die - "+prob2);
			System.out.println("\r rolling at least 2 six in 24 throws is more likely");
		}
		else if (prob2==prob1){
			System.out.println("equal - try again");
		}

	}
}
