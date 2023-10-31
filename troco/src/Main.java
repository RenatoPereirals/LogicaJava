import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float precoDoProduto, valorPago;
        int quatidadeProduto;

        System.out.print("Preço unitário do produto: ");
        precoDoProduto = sc.nextFloat();
        System.out.print("Quantidade comprada: ");
        quatidadeProduto = sc.nextInt();
        System.out.print("Valor pago: ");
        valorPago = sc.nextFloat();

        float troco = precoDoProduto * quatidadeProduto - valorPago;

        System.out.printf("Troco = %.2f\n", troco);

        sc.close();
    }
}