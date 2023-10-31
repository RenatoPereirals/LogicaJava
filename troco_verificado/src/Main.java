import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int quantidade;
        float precoUnitario, dinheiroRecebido, troco;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço do produto: ");
        precoUnitario = sc.nextFloat();
        System.out.print("Qantidade comprada: ");
        quantidade = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = sc.nextFloat();

        troco = dinheiroRecebido - precoUnitario * quantidade;

        if (troco > 0) {
            System.out.printf("TROCO = %.2f\n", troco);
        } else if (troco < 0) {
            System.out.printf("DINHEIRO INSOFICIENTE. FALTAM %.2f REAIS", troco * -1);
        }

        sc.close();
    }
}