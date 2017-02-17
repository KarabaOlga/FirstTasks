import java.util.Scanner;

public class Task6_EvenNumber{
	
	public static void main(String[] args){
		
		System.out.print("Enter the number from 1 to 9: ");
	    Scanner in = new Scanner(System.in);
        int a = in.nextInt();
		
		if (a%2==0) { System.out.println(" The number is even.");}
		else {System.out.println(" The number isn`t even.");}
	}
}