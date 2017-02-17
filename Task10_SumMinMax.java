import java.util.Scanner;

public class Task10_SumMinMax{
    public static void main(String[] args){
	
	int[] a = new int[3];
	Scanner in = new Scanner(System.in);
	
	for (int i=0; i<3;i++){
	System.out.print("Enter " + (i+1) +" number: ");
	a[i] = in.nextInt();
	}
	
	int max=a[0];
	int min=a[0];
	
	for(int i=0; i<3; i++){
		if(a[i]>max){
			max=a[i];
		}
		if(a[i]<min){
			min=a[i];
		}
	}
     
    System.out.println("Sum max+min=" +(max+min));
	}
}	
	