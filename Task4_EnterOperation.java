import java.util.Scanner;

public class Task4_EnterOperation{
	
	public static void main(String[] args){
		
		System.out.print("Enter first number: ");
	    Scanner in = new Scanner(System.in);
        int a = in.nextInt();
		
		System.out.print("Enter second number: ");
		Scanner in2 = new Scanner(System.in);
		int b = in2.nextInt();
		
		System.out.print("Enter arithmetic operation: ");
		Scanner in3 = new Scanner(System.in);
		String c = in3.nextLine();
		
		switch (c){
		 case "+" : System.out.println(a+b);
		   break;
		 case "-" : System.out.println(a-b);
		   break;
		 case "*" : System.out.println(a*b);
		   break;
		 case "/" : System.out.println(a/b);
		   break;
		   default: System.out.println("Invalid input operation ");
		}
	}
}	

