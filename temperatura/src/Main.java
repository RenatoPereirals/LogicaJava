import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char escala;
        double fahrenheit, celcius;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        escala = sc.next().charAt(0);

        if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            fahrenheit = sc.nextDouble();
            celcius = 5 *  (fahrenheit - 32) / 9;
            System.out.printf("Temperatura equivalente em Celsius: %.2f", celcius);
        } else {
            System.out.print("Digite a temperatura em  Celsius: ");
            celcius = sc.nextDouble();
            fahrenheit = celcius * 9 / 5 + 32;
            System.out.printf("Temperatura  em Fahrenheit: %.2f", fahrenheit);
        }



        sc.close();
    }
}