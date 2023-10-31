import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    float dist1, dist2, dist3;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as tres distancias:");
        dist1 = sc.nextFloat();
        dist2 = sc.nextFloat();
        dist3 = sc.nextFloat();

        if (dist1 > dist2 && dist1 > dist3) {
            System.out.printf("MAIOR DISTANCIA = %.2f", dist1);
        } else System.out.printf("MAIOR DISTANCIA = %.2f", Math.max(dist2, dist3));

        sc.close();
    }
}