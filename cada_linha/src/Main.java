import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

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

        int[] maior = new int[n];

        for (int i = 0; i < n; i++) {
            maior[i] = mat[0][0];
            for (int j = 0; j < n; j++) {
                if (maior[i] < mat[i][j]) {
                    maior[i] = mat[i][j];
                }
            }
        }
        System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
        for (int i = 0; i < n; i++) {
            System.out.println(maior[i]);
        }

        sc.close();
    }
}