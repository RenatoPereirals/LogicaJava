import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, soma, cont;
        double media;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        soma = 0;
        cont = 0;

        for (int i =0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                soma += vet[i];
                cont++;
            }
        }

        if (cont != 0) {
            media = (double) soma / cont;
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        } else System.out.println("NENHUM NUMERO PAR");

        sc.close();
    }
}