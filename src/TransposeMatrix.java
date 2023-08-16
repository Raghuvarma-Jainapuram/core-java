import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows:");
		int m = sc.nextInt();
		System.out.println("Enter columns:");
		int n = sc.nextInt();

		int[][] matrix = new int[m][n];
		System.out.println("Enter " + (m*n) + " values :");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Original Matrix :");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Transpose Matrix:");
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
