import java.util.Scanner;

public class Task12_BreakStop{
	
	public static void main(String[] args){ 
		String b="stop";
		do{ 
	     System.out.print("Enter String: ");
		 Scanner in = new Scanner(System.in);
         String a = in.nextLine();
		 if(a.equals(b))break;
		}while(true);
	}
}
			