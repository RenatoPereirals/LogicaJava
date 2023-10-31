import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n,  numerador, denominador;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos voce vai digitar? ");
        n = sc.nextDouble();

        for (int i = 1; i <=n; i++) {
            System.out.print(" Entre com o numerador: ");
            numerador = sc.nextDouble();
            System.out.print(" Entre com o denominador: ");
            denominador = sc.nextDouble();

            if (denominador == 0) {
                System.out.println("Divisão impossivel");
            } else {
                System.out.printf("DIVISÃO = %.2f\n", numerador/denominador);
            }
        }


        sc.close();
    }
}