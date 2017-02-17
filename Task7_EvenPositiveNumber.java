import java.util.Scanner;

public class Task7_EvenPositiveNumber{
	
	public static void main(String[] args){
		
		System.out.print("Enter the number from -9 to 9: ");
	    Scanner in = new Scanner(System.in);
        int a = in.nextInt();
		
		if (a%2==0) { 
		   if(a>=0) {System.out.println(" The number is positive even.");}
		else {System.out.println("The number is negative even.");}
		}
		else {System.out.println(" The number isn`t even.");}
		
	}
}