import java.util.Scanner;

public class Task14_MatrixSumDiagonal{
	
	public static void main(String[] args){ 
	
	
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the number of rows of the array: ");
	int a=in.nextInt();
	System.out.print("Enter the number of columns of the array: ");
	int b=in.nextInt();
	
	int [][] arr = new int[a][b];
	
	for (int i=0; i<arr.length; i++){
		for (int j=0; j<arr[0].length; j++){
			System.out.print("Enter element arr[" +i+ "][" +j+ "]:");
			arr[i][j]=in.nextInt();
		}
	}
	int sum=0;
	
	
	for (int i=0; i<arr.length; i++){
		for (int j=0; j<arr[0].length; j++){
		System.out.print(arr[i][j]+" ");
			
	        if ( i==j){
				sum+=arr[i][j];
				}
		}
		System.out.println();
	}
	
	System.out.println(" Sum of the diagonal elements of the matrix " + sum);
	
	}
}
	
	