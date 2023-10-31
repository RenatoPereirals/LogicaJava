import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, linha, coluna;
        double somaPositivo = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();

        double[][] mat = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > 0) {
                    somaPositivo += mat[i][j];
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.printf("SOMA DOS POSITIVOS = %.1f", somaPositivo);

        System.out.println();
        System.out.println();
        System.out.print("Escolha uma linha: ");
        linha = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%.1f ", mat[linha][j]);
        }

        System.out.println();
        System.out.println();
        System.out.print("Escolha uma coluna: ");
        coluna = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", mat[i][coluna]);
        }

        System.out.println();
        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", mat[i][i]);
        }

        System.out.println();
        System.out.println();
        System.out.println("MATRIZ ALTERADA: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    mat[i][j] = Math.pow(mat[i][j], 2);
                }
                System.out.printf("%.1f ", mat[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}