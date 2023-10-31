import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x, y;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de X: ");
        x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else
            if (x == 0) {
                System.out.println("EIXO Y");
            } else if (y == 0) {
                System.out.println("EIXO X");
            } else
                if (x > 0 && y > 0) {
                    System.out.println("Q1");
                } else if (x < 0 && y > 0) {
                    System.out.println("Q2");
                } else if (x < 0 && y < 0) {
                    System.out.println("Q3");
                } else if (x > 0 && y < 0) {
                    System.out.println("Q4");
                }

        sc.close();
    }
}