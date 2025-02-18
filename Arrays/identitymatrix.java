package Array;

import java.util.Scanner;

public class IdentityMatrixBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows/columns of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isIdentity = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] != 1) {
                    isIdentity = false;
                    break;
                }
                if (i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
        }

        if (isIdentity) {
            System.out.println("The matrix is an Identity Matrix.");
        } else {
            System.out.println("The matrix is NOT an Identity Matrix.");
        }
    }
}

