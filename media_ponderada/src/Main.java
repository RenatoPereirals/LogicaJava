import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        double a, b, c, media;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos voce vai digitar? ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite tres numeros:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            media = ((a * 2) + (b * 3) + (c * 5)) / 10;
            System.out.printf("MEDIA = %.1f\n", media);
        }

        sc.close();
    }
}