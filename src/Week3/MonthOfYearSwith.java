package Week3;

import java.util.Scanner;

public class MonthOfYearSwith {

	public static void main(String[] args) {
		//Write a program to input number "Input a number between 1-12" 
		//and when you input a number it should display the month using Scanner and Switch statement.

	//case: 1 will display January

	//case: 12 will display December

	//Anything outside of 12 will display "Invalid"
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter the number for month of the year");
 int month=scan.nextInt();
 switch(month) {
 case 1:
 System.out.println("Januray");
 break;
 case 2:
	 System.out.println("Feburay");
	 break;
 case 3:
	 System.out.println("March");
 case 4:
	 System.out.println("April");
	 break;
 case 5:
	 System.out.println("May");
	 break;
 case 6:
	 System.out.println("June");
	 break;
 case 7:
	 System.out.println("July");
	 break;
 case 8:
	 System.out.println("Augest");
	 break;
 case 9:
	 System.out.println("September");
	 break;
 case 10:
	 System.out.println("October");
	 break;
 case 11:
	 System.out.println("November");
	 break;
 case 12:
	 System.out.println("December");
	 break;
 default:
		 System.out.println("Invalid month ");
	 break;
	 
 }
 


	

		
		
		
		
		
		
	}

}
