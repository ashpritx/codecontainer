import java.util.*;

public class practical10 {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> prices = new LinkedHashMap<Integer,String>();
		prices.put(1, "Cheese and tomato, £6.00");
		prices.put(2, "Pepperoni and mozzarella, £8.50");
		prices.put(3, "Bacon and cheese, £9.25");
		prices.put(4, "Chicken and mushroom, £9.00");
		prices.put(5, "Hawaiian, £7.25");
		
		ArrayList<Integer> orderList= new ArrayList<Integer>();
		
		float delivFee = 0;
		
		float total = 0;
		
		boolean complete = false;
		
		while(complete == false) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("To order, please enter the number. If you would like to order more than one thing, please enter the number of the menu item you want to order when prompted again. \n"
					+ "1. Cheese and tomato, £6.00\r\n"
					+ "2. Pepperoni and mozzarella, £8.50\r\n"
					+ "3. Bacon and cheese, £9.25\r\n"
					+ "4. Chicken and mushroom, £9.00\r\n"
					+ "5. Hawaiian, £7.25 \r\n"
					+ " ");
			String order = sc.nextLine();
			switch(order) {
				case ("1"):
					System.out.println("You have added Cheese and Tomato. Is this correct? Yes or No");
					if(sc.nextLine().equalsIgnoreCase("yes")) {
						total = total + 6.00f;
						orderList.add(1);
						break;
					}
					else {     
						break;}
				case("2"):
					System.out.println("You have added Pepperoni and mozzarella. Is this correct? Yes or No");
					if(sc.nextLine().equalsIgnoreCase("yes")) {
						total = total + 8.50f;
						orderList.add(2);
						break;
					}
					else if(sc.nextLine().equalsIgnoreCase("no")){
						break;
						}
					else {
						System.out.println("Invalid input, terminating.");
						System.exit(0);
					}
				case("3"):
					System.out.println("You have added Bacon and cheese. Is this correct? yes or no");
					if(sc.nextLine().equalsIgnoreCase("yes")) {
						total = total + 9.25f;
						orderList.add(3);
						break;
					}
					else if(sc.nextLine().equalsIgnoreCase("no")){
						break;
						}
					else {
						System.out.println("Invalid input, terminating.");
						System.exit(0);
						}
				case("4"):
					System.out.println("You have added Chicken and mushroom. Is this correct? yes or no");
				if(sc.nextLine().equalsIgnoreCase("yes")) {
					total = total + 9.00f;
					orderList.add(4);
					break;
				}
				else if(sc.nextLine().equalsIgnoreCase("no")){
					break;
					}
				else {
					System.out.println("Invalid input, terminating.");
					System.exit(0);
					}
				case("5"):
					System.out.println("You have added Hawaiian. Is this correct? yes or no");
					if(sc.nextLine().equalsIgnoreCase("yes")) {
						total = total + 7.25f;
						orderList.add(5);
						break;
					}
					else if(sc.nextLine().equalsIgnoreCase("no")){
						break;
						}
					else {
						System.out.println("Invalid input, terminating.");
						System.exit(0);
					}
				default:
					System.out.println("Invalid input try again.");
					break;
			}//end of switch case
			
			System.out.println("Is you order complete? Yes or No");
			if (sc.nextLine().equalsIgnoreCase("yes")) {
				Scanner mile = new Scanner(System.in);
				
				System.out.println("How many miles away from the store are you?");
				float distMiles = mile.nextFloat();
				if(distMiles <= 1 ) {
					System.out.println("Your delivery is free");
				}
				else if (distMiles>1 && distMiles<3) {
					System.out.println("Your delivery will cost £3.00");
					total = total + 3;
					delivFee = delivFee + 3;
				}
				else if (distMiles>3 && distMiles<6) {
					System.out.println("Your delivery will cost £6.00");
					total = total + 6;
					delivFee = delivFee + 6;
				}
				else if (distMiles>6) {
					System.out.println("You are out of our delivery range. Unfortunately we cannot deliver to you.");
					System.exit(0);
				}
				else {
					System.out.println("Invalid input. Terminating.");
					System.exit(0);
				}
				complete = true;
			}
			else if(sc.nextLine().equalsIgnoreCase("no")){
				break;
			}
			else {
				System.out.println("Invalid Input. Try again");
			}
			
		}//end of while loop
		System.out.println("================================");
		System.out.printf("Your total:");
		System.out.println("Your order costs £"+total);
		System.out.println("Your delivery costs: £"+delivFee);
		System.out.println("You ordered: ");
		for(int j = 0; j <orderList.size();j++) {
			System.out.println(prices.get(orderList.get(j)));
		}
		System.out.println("================================");
		
		
	}

}
