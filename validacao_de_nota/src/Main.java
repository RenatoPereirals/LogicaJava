import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double media, nota1, nota2;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Valor invlido! Tente novamente: ");
            nota1 = sc.nextDouble();
        }

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextInt();

        while (nota2 < 0 || nota2 > 10) {
            System.out.print("Valor invlido! Tente novamente: ");
            nota2 = sc.nextDouble();
        }

        media = (nota1 + nota2) / 2;

        System.out.printf("MEDIA = %.2f", media);

        sc.close();
    }
}