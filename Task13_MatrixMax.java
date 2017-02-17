import java.util.Scanner;

public class Task13_MatrixMax{
	
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
	int max=arr[0][0];
	int k=0;
	int m=0;
	
	for (int i=0; i<arr.length; i++){
		for (int j=0; j<arr[0].length; j++){
		System.out.print(arr[i][j]+" ");
			
	        if (arr[i][j]>max){
				k=i;
				m=j;
				max=arr[i][j];
				
				}
		}
		System.out.println();
	}
	
	System.out.println("Max elemint is " +max);
	
	System.out.println("[i]="+k+"  [j]="+m);
	
	for (int i=0; i<arr.length-1; i++){
		for (int j=0; j<arr[0].length; j++){
			if (i>=k){
			arr[i][j]=arr[i+1][j];
			}
			System.out.print(arr[i][j]+" ");
		}System.out.println();
	}
	
	
	for (int i=0; i<arr.length; i++){
		for (int j=0; j<arr[0].length-1; j++){
			if (j>=m){
			arr[i][j]=arr[i][j+1];
			}
			System.out.print(arr[i][j]+" ");
		}System.out.println();
	}
	
	}
}
			
			
	
	
	