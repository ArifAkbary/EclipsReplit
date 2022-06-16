package Week3;

import java.util.Scanner;

public class LogicalOp37 {

	public static void main(String[] args) {
		
			//"Are you thirsty?"

			//"Are you sleepy?"

			//If user is thirsty and not sleepy--> drink=water

			//If user is thirsty and sleepy--> drink=coffee

			//If user is not thirsty and sleepy --> drink=tea

			//Otherwise drink="nothing"

			//Output:
			//Looks like you need to drink ___
          Scanner scan=new Scanner(System.in);
          System.out.println("Are you thirsty ?");
          boolean thirsty=scan.nextBoolean();
          
          System.out.println("Are you sleepy?");
          boolean sleepy=scan.nextBoolean();
           
          if(thirsty && !sleepy) {
        	  System.out.println("Looks like you need to drink water");
          }else if(thirsty && sleepy) {
        	  System.out.println("Looks like you need to drink coffe");
          }else if (!thirsty && sleepy){
        	  System.out.println("Looks like you need to drink tea ");
		
	}else {
		System.out.println("looks like you need to drink noting ");
	}
         System.out.println("============================================");
	}
}
