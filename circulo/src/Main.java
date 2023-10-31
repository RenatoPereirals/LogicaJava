import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double r, area;

        System.out.print("Digite o valor do raio: ");
        r = sc.nextDouble();

        area = pi * Math.pow(r, 2);

        System.out.printf("AREA = %.3f", area);

        sc.close();
    }
}