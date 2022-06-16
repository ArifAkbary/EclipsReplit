package Week3;

import java.util.Scanner;

public class SantaxTeachreAssingment {

	public static void main(String[] args) {
		
		
		
	
		//By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.

		//First Output: "Enter name of the instructor"
		//case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
		//case 2: if User provided the name as Moazzam as input it should show  "Will take care of SDLC Assignment"
		//case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
		//case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
		//Other than these four names if the user provides any other names --> " Invalid instructor selected"
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of instrutor");
        String teacher=input.nextLine();
 
        switch(teacher) {
        
        case "Asghar":
        	teacher="Java ";
        break;
        
        case "Moazzam":
        	teacher="SDLC";
        break;
        
        case"Wegas":
        	teacher="Selsenum";
        break;
        
        
        case "Asal":
        	teacher="all";
        break;
        
        default:
        	teacher="invilid Teacher ";
        	break;
        } 
        System.out.println("will take care of every " + teacher + " assignment ");
        
        
        
        
        
        
        
        
        
	}
}

