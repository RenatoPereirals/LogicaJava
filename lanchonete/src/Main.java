import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int codigo, qunatidade;
        float valor = 0, total;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        qunatidade = sc.nextInt();

        switch (codigo) {
            case 1 -> valor = (float) 5.00;
            case 2 -> valor = (float) 3.50;
            case 3 -> valor = (float) 4.80;
            case 4 -> valor = (float) 8.90;
            case 5 -> valor = (float) 7.32;
        }

        total = qunatidade * valor;

        System.out.printf("Valor a pagra R$ %.2f", total);

        sc.close();
    }
}