import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        double media, soma, contMenore16, menores16;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String [] nome = new String[n];
        int [] idade = new int[n];
        double [] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        soma = 0;

        for (int i = 0; i< n; i++) {
            soma += altura[i];
        }

        media = soma / n;
        contMenore16 = 0;

        for (int i = 0; i< n; i++) {
            if (idade[i] < 16) {
                contMenore16++;
            }
        }

        menores16 = (contMenore16 / n) * 100;

        System.out.println();
        System.out.printf("Altura media = %.2f\n", media);
        System.out.printf("Pessoas com menos de %.1f%% anos\n", menores16);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}