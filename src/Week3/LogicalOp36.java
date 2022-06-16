package Week3;

import java.util.Scanner;

public class LogicalOp36 {

	public static void main(String[] args) {
		 
		
             //: "Please enter two strings"and two integers:
			//"Please enter two numbers"

			//and make the comparisons:

			//if int1 and int2 are equal and word1 and word2 are equal, output "AND"
			//if int1 and int2 are equal or word1 and word2 are equal, output "OR"
			//if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
		
		    Scanner scan= new Scanner(System.in);
		    
		    System.out.println("Please enter two worlds");
		    String word1=scan.nextLine();
		    String word2=scan.nextLine();
		    
		    System.out.println("Please enter two numbers");
		    int num1=scan.nextInt();
		    int num2=scan.nextInt();
		    
		    if(num1 ==num2 && word1.equals(word2)) {
		    	System.out.println("And");
		    }else if(num1==num2 || word1.equals(word2)) {
		    	System.out.println("OR");
		    }else {
		    	System.out.println("NONE");
		    	
		    } 
		    System.out.println("===========================================");
		    }

	}


