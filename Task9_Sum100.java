import java.util.Scanner;

public class Task9_Sum100{
	
	public static void main(String[] args){
		
		int count=100;
		int i=1;
		int sum=0;
		
		while(i<=count){
		sum+=i;
		i++;}
		System.out.println(" The sum of the numbers from 0 to 100: " + sum);
		
		int result=0;
		
		for (int j=1;j<=100;j++){
			result+=j;
		}
		System.out.println(" The sum of the numbers from 0 to 100: " + result);
		
	}
}