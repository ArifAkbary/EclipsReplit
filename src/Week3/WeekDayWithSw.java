package Week3;

import java.util.Scanner;

public class WeekDayWithSw {

	public static void main(String[] args) {
		
		//Ask the user to enter any number from 1-7.

		//Based on the number define the day of the week

		Scanner input=new Scanner(System.in);
		System.out.println(" Please enter one number from 1 to 7 for the week days");
		int weekDays=input.nextInt();
		String a;
		switch(weekDays) {
		case 1:
			a="Monday";
			break;
		case 2:
			a="Tuesdays";
			break;
		case 3:
			a="Wensday";
			break;
		case 4:
			a="Thuresday";
			break;
		case 5:
			a="Friday";
			break;
		case 6:
			a="Saturday";
			break;
		case 7:
			a="Sunday";
			break;
		default:
			a="Invalid day";
			break;
			
			
				
		}
		
		
		System.out.println("According to you enter number to day is " +a);
		
		System.out.println("------------------");
		
		
	}

}
