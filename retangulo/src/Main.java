import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float base, altura,area, perimetro, diagonal;

        System.out.print("Base do retangulo: ");
        base = sc.nextFloat();
        System.out.print("Altura do triangulo: ");
        altura = sc.nextFloat();

        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = (float) Math.sqrt(Math.pow(base, 2) + (Math.pow(altura, 2)));

        System.out.printf("AREA = %.3f\n", area);
        System.out.printf("PERIMETRO = %.3f\n", perimetro);
        System.out.printf("DIAGONAL = %.3f\n", diagonal);

        sc.close();
    }
}