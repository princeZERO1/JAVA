import java.util.Scanner;

public class Addandmulti {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = s.nextInt();
        System.out.print("Enter number of columns: ");
        int col = s.nextInt();

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] sum = new int[row][col];
		int[][] multi = new int[row][col];

        // Input matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = s.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = s.nextInt();
            }
        }

        // Compute sum
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
		
		// compute Multi
		 for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                multi[i][j] = a[i][j] * b[i][j];
            }
        }

        // Display matrices and sum
        System.out.println("Matrix A:");
        printMatrix(a);

        System.out.println("Matrix B:");
        printMatrix(b);

        System.out.println("Sum of the matrices:");
        printMatrix(sum);
		
		System.out.println("Multiplication of the matrices:");
        printMatrix(multi);
    }

    // Helper function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}