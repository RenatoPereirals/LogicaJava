import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, abaixo = 0, entre = 0, acima = 0;
        double lucro, totalCompra = 0, totalVenda = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Serao digitados dados de quantos produtos? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        double[] pCompra = new double[n];
        double[] pVenda = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Produto %d:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("Preco de compra: ");
            pCompra[i] = sc.nextDouble();
            System.out.print("Preco de venda: ");
            pVenda[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            lucro = (pVenda[i] - pCompra[i]) / pCompra[i] * 100;
            if (lucro < 10) {
                abaixo++;
            } else if (lucro < 20){
                entre++;
            } else {
                acima++;
            }
        }
        for (int i = 0; i < n; i++) {
            totalCompra += pCompra[i];
            totalVenda += pVenda[i];
        }

        System.out.println();
        System.out.println("RELATORIO:");
        System.out.printf("Lucro abaixo de 10%%: %d\n", abaixo);
        System.out.printf("Lucro entre de 10%% e 20%%: %d\n", entre);
        System.out.printf("Lucro acima de 20%%: %d\n", acima);

        System.out.printf("Valor total de compras: %.2f\n", totalCompra);
        System.out.printf("Valor total de vendas: %.2f\n", totalVenda);
        System.out.printf("Lucro total: %.2f\n", totalVenda - totalCompra);

        sc.close();
    }
}