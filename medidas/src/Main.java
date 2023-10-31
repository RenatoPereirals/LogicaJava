import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        float a, b, c;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida de A: ");
        a = sc.nextFloat();
        System.out.print("Digite a medida de B: ");
        b = sc.nextFloat();
        System.out.print("Digite a medida de C: ");
        c = sc.nextFloat();

        System.out.printf("AREA DO QUADRADO = %.4f\n", Math.pow(a,2));
        System.out.printf("AREA DO TRIANGULO = %.4f\n", a * b / 2);
        System.out.printf("AREA DO TRAPÉZIO = %.4f\n", (a + b) * c / 2);

        sc.close();
    }
}