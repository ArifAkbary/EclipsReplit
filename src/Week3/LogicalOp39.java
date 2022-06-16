package Week3;

import java.util.Scanner;

public class LogicalOp39 {

	public static void main(String[] args) {
		    //A school has following rules for grading system: 
			//a. 1 to 25 - F b. 25 to 45 - E c. 45 to 50 - D d. 50 to 60 - C e. 60 to 80 - B f.
			//Above 80 - A Ask the user to enter marks and print the corresponding grade.

           Scanner scan=new Scanner(System.in);
           
           System.out.println("Enter marks please ");
           int num=scan.nextInt();
           char rank = 0;
          
           if(num>=1 && num <=25) {
        	   rank = 'F';
           }else if(num>=25 && num<=45){
        	   rank='E';
           }else if (num>=45 && num <=50) {
        	   
           }else if(num>=50 && num <=60) {
        	   rank='D';
           }else if(num>=60 && num<=70) {
        	   rank='C';
           }else if(num>70 &&num <=80) {
        	   rank='B';
           }else if(num>=80) {
        	   rank='A';
        	   
           }
         System.out.println("acording to your marks in the class you are located in rank of # " + rank);
         
         
         

	}

}
