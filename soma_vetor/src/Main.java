import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        double soma, media;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet [i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i< n; i++) {
            System.out.printf("%.1f ", vet[i]);
        }

        soma = 0;

        for (int i = 0; i < n; i++) {
            soma += vet[i];
        }

        System.out.printf("\nSOMA = %.2f\n", soma);

        media = soma / n;
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}