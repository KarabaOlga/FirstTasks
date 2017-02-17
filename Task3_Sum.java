import java.util.Scanner;

public class Task3_Sum{
	
	public static void main(String[] args){
		
		System.out.print("Enter first number a: ");
	    Scanner in = new Scanner(System.in);
        int a = in.nextInt();
		
		Scanner in2= new Scanner(System.in);
		System.out.print("Enter second number b: ");
		int b = in2.nextInt();
		
		System.out.println("Sum a+b=" + (a+b));
	}
}	