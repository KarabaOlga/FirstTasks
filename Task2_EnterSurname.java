import java.util.Scanner;

public class Task2_EnterSurname{
	
	public static void main(String[] args){
	    System.out.println("Enter your Surname");
	    Scanner in = new Scanner(System.in);
        String surname = in.nextLine();
		
		System.out.println("Enter your name");
		Scanner in2 = new Scanner(System.in);
        String name = in2.nextLine();
		System.out.println(name);
		
		System.out.println("Enter your patronymic");
		Scanner in3 = new Scanner(System.in);
        String patronymic = in3.nextLine();
		
		System.out.println(surname);
		System.out.println(name);
		System.out.println(patronymic);
		}
}
