import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int duracao;
        float valor = 50;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a qantidade de minutos: ");
        duracao = sc.nextInt();

        if (duracao > 100) {
            valor = (duracao - 100) * 2 + 50;
        }

        System.out.printf("Valor a pagar : R$ %.2f\n", valor);

        sc.close();
    }
}