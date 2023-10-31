import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int m, n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter cada matriz? ");
        m = sc.nextInt();
        System.out.print("Quantas colunas vai ter cada matriz? ");
        n = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] soma = new int[m][n];

        System.out.println("Elementos da matriz A:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("Elmento [%d,%d]: ", i, j);
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elementos da matriz B:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("Elmento [%d,%d]: ", i, j);
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ SOMA:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                soma[i][j] = A[i][j] + B[i][j];
                System.out.printf( "%d ", soma[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}