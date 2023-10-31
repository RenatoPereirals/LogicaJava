import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int m, n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        m = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVO");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    System.out.println(mat[i][j]);
                }
            }
        }

        sc.close();
    }
}