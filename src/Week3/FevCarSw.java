package Week3;

import java.util.Scanner;

public class FevCarSw {

	public static void main(String[] args) {
		//Prompt user with questions: "Please enter your favorite car make"

			//if user enters BMW --> carOrigin = "german car"
			//if user enters Toyota --> carOrigin = " japanese car"
			//if user enters Maserati --> carOrigin = "italian car"
			//anything else besides those values --> carOrigin = "unknown"
			//The output of your program should be:
			//"Your favorite car is ___"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your favorite car make ?");
		String car=scan.nextLine();
		
		switch(car) {
		case "BMW":
			System.out.println("your favorite car is german car");
			break;
		case "Toyota":
			System.out.println("your favorite car is janpani car");
			break;
		case "Maserati":
			System.out.println("your favorite car is italian car");
			break;
		case "Tezla":
			System.out.println(" your favorite car is amircan car ");
			break;
		default:
			System.out.println(" I do not know your favortie car ");
			
		}
		
		System.out.println("------------------");
		
		
		
		
		
		
		

	}

}
