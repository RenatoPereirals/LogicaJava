import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, nuMaior;
        double maior;

        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        maior = vet[0];
        nuMaior = 0;

        for (int i = 0; i < n; i++) {
           if (maior < vet[i]) {
               maior = vet[i];
               System.out.print(maior);
               nuMaior = i;
           }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", nuMaior);
        sc.close();
    }
}