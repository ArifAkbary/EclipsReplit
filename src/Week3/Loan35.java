package Week3;

import java.util.Scanner;

public class Loan35 {

	public static void main(String[] args) {
		
		//Create a program that prompt user with question: "Do you need a loan?"(Use a boolean)

		//If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"

		//Based on the score define users eligibility:

		//if score is below 600 --> eligibility = "Not eligible"
		//if score is between 600 and 700 inclusive --> eligibility = "Maybe eligible"
		//if score is between 701 and 800 inclusive --> eligibility = "Eligible"
		//if score is higher than any other previous values --> eligibility = "Definitely eligible" .
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("do you need loan answer with true or false");
		boolean a=scan.nextBoolean();
		
		String eligibility = null;
		if(a) {
			System.out.println("what is your credite score?");
			int num=scan.nextInt();
			
			if(num<600) {
				eligibility="not eligible";
			}else if(num>=600 && num<=700) {
				eligibility="Maybe eligible";
			}else if(num>=700 && num <=800) {
				eligibility="eligible";
			}else if(num>800) {
				eligibility="Defenitly eligible";
			}
				
			
		}else{
			eligibility="unknown";
			
			
		}
		System.out.println("your eligiblity is must be "+eligibility);
		System.out.println("================================");
	}
}
	

	
       
       

