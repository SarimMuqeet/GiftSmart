package windowBuilder.views;

import java.awt.EventQueue;
import java.util.ArrayList;
import windowBuilder.views.recipient_details;

public class gift {
	
	private static gift ducky;
	public String name;
	public static String gender;
	public String age_range;
	public double price;
	public String type;
	public String link;
	public int score;
	private static Object gender_selection;
	static ArrayList<gift> gifts;
	
	//Constructor to assign create attributes for gift
	
	public gift(String gift_name, String gift_gender, String gift_age_range, double gift_price, String gift_type, String gift_link, int gift_score) {
		name = gift_name;
		gender = gift_gender;
		age_range = gift_age_range;
		price = gift_price;
		type = gift_type;
		link = gift_link;
		score = gift_score;
		
	}
	
	//Method for sorting through gifts ArrayList and updating point values
	
	public static void gift_sorter (ArrayList <gift> gifts) {
		for (gift results : gifts) {
			
			System.out.println(results.name);
			
			
		}
		
	}
	
	public static void score_updater (ArrayList <gift> gifts) {
		for (gift results : gifts) {
			
			String gender = recipient_details.gender_checker();
			String age_range = recipient_details.age_range_checker();
			boolean sports_interest = recipient_details.sportsChecker();
			boolean clothes_interest = recipient_details.clothesChecker();
			boolean toys_interest = recipient_details.toysChecker();
			boolean education_interest = recipient_details.educationChecker();
			boolean electronics_interest = recipient_details.electronicsChecker();
			boolean accessories_interest = recipient_details.accessoriesChecker();
			boolean houseItems_interest = recipient_details.houseItemsChecker();
			
			if (gender == gift.gender) {
				results.score += 10;
			}
			
			if (age_range == results.age_range) {
				results.score += 5;
			}
			
			if (sports_interest == true && results.type == "sports") {
				results.score += 1;
			}
			
			else if (clothes_interest == true && results.type == "clothes") {
				results.score += 1;
			}
			
			else if (toys_interest == true && results.type == "toys") {
				results.score += 1;
			}
			
			else if (education_interest == true && results.type == "education") {
				results.score += 1;
			}
			
			else if (electronics_interest == true && results.type == "electronics") {
				results.score += 1;
			}
			
			else if (accessories_interest == true && results.type == "accesories") {
				results.score += 1;
			}
			
			else if (houseItems_interest == true && results.type == "house items") {
				results.score += 1;
			}
			
			System.out.println(results.score);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<gift> gifts = new ArrayList<gift>();
		
		//Instantiating Objects
		
		
		gift ducky = new gift("duck", "boy", "5-7", 4.99, "toy", "ducklink", 0);
		gifts.add(ducky);
		gift bum = new gift("bum", "girl", "8-12", 5.99, "toy", "bumlink", 0);
		gifts.add(bum);
		gift poop = new gift("poop", "girl", "13-16", 5.99, "toy", "bumlink", 0);
		gifts.add(poop);
		
		gift.score_updater(gifts);
		
		
		
		
		
		
	}
	
	
	
}
