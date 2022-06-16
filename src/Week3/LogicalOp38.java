package Week3;

import java.util.Scanner;

public class LogicalOp38 {

	public static void main(String[] args) {
		
		
		
		    //prompt user with a question: "Is it weekend?"

			//If it is not a weekend --> subject="manual testing"

			//Otherwise --> subject="Java"

			//Output:

			//Today you will be learning ____
		Scanner input=new Scanner(System.in);
		System.out.println("Is it weeked ?");
		String answer=input.next();
		
		if(answer.equals("yes")) {
			System.out.println("Today you will be learning manual teasting ");
		}else{
			System.out.println("Today you will be leaning java class");
		}
		System.out.println("==============================");
		

	}


}
