import java.util.Scanner;

public class Task8_Month{
	
	public static void main(String[] args){
		
		System.out.print("Enter the month: ");
	    Scanner in = new Scanner(System.in);
        String a = in.nextLine();
		
		switch (a){
		 case "January" :
		 case "February":
		 case "December":
            System.out.println("Winter");
		    break;
		 case "March": 
		 case "April":
		 case "May"  :
		    System.out.println("Spring");
		    break;
		 case "June" : 
		 case "July" :
		 case "August":
		 System.out.println("Summer");
		   break;  
		 case "September": 
		 case "October" :
		 case "November":
		    System.out.println("Autumn");
		    break;
		   default: System.out.println("It is not the month");
		}
	}
}	