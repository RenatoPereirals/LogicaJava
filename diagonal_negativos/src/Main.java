import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, cont = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL:");
        for (int i = 0; i < n; i++) {
                System.out.print(mat[i][i] + " ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] < 0) {
                    cont++;
                }
            }
        }

        System.out.printf("\nQUANTIDADE DE NUMEROS NEGATIVOS: %d", cont);

        sc.close();
    }
}