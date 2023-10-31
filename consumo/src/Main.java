import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float distancia, cosumo, media;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextFloat();
        System.out.print("Combustivel gasto: ");
        cosumo = sc.nextFloat();

        media = distancia/cosumo;

        System.out.printf("Consumo medio = %.3f", media);

        sc.close();
    }
}