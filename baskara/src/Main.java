import java.util.Locale;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double a, b, c, x1, x2, delta;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        a = sc.nextFloat();
        System.out.print("Coeficiente b: ");
        b = sc.nextFloat();
        System.out.print("Coeficiente c: ");
        c = sc.nextFloat();

        delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0.0 || a < 0.0){
            System.out.println("Esta equacao nao possui raizes reais");
        }else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("X1 = %.4f\n", x1);
            System.out.printf("X2 = %.4f\n", x2);
        }

        sc.close();
    }
}