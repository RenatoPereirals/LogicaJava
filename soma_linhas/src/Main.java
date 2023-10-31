import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int m, n;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas: ");
        m = sc.nextInt();
        System.out.print("Qual a quantidade de colunas: ");
        n = sc.nextInt();

        double[][] mat = new double[m][n];
        double[] vet = new double[m];

        for (int i = 0; i < m; i++) {
            System.out.printf("Digite os elementos da %da. linha:\n", i + 1);
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < m; i++) {
            vet[i] = 0;
            for (int j = 0; j < n; j++) {
                vet[i] += mat[i][j];
            }
        }

        System.out.println("VETOR GERADO: ");
        for (int i = 0; i < m; i++) {
            System.out.printf("%.1f\n",vet[i]);
        }

        sc.close();
    }
}