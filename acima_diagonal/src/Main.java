import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0;j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    soma += mat[i][j];
                }
            }
        }

        System.out.printf("SOMA DOS ELEMENTOS ACIMA" +
                " DA DIAGONAL PRINCIPAL = %d", soma);

        sc.close();
    }
}