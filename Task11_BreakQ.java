import java.util.Scanner;

public class Task11_BreakQ{
	
	public static void main(String[] args){ 
		String b="q";
		do{ 
	     System.out.print("Enter the symbol: ");
		 Scanner in = new Scanner(System.in);
         String a = in.nextLine();
		 if(a.equals(b))break;
		}while(true);
	}
}
			