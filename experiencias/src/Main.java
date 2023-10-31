import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char tipoCobaia;
        int n,qtdCobaias, totalCobaias, totalCoelhos, totalRatos, totalSapos;
        double pCoelhos, pRatos, pSapos;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos de teste serao digitados? ");
        n = sc.nextInt();

        totalCoelhos = 0;
        totalRatos = 0;
        totalSapos = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Quantidade de cobaias? ");
            qtdCobaias = sc.nextInt();
            System.out.print("Tipo de Cobaia? ");
            tipoCobaia = sc.next().charAt(0);

            switch (tipoCobaia) {
                case 'C' -> totalCoelhos = totalCoelhos + qtdCobaias;
                case 'R' -> totalRatos = totalRatos + qtdCobaias;
                case 'S' -> totalSapos = totalSapos + qtdCobaias;
            }
        }

        totalCobaias = totalCoelhos + totalRatos + totalSapos;
        pCoelhos = (double) totalCoelhos / totalCobaias * 100;
        pRatos = (double) totalRatos / totalCobaias * 100;
        pSapos = (double) totalSapos / totalCobaias * 100;

        System.out.println();
        System.out.println("RELATÓRIO FINAL:");

        System.out.printf("Total de coelhos:  %d\n", totalCoelhos);
        System.out.printf("Total de ratos:  %d\n", totalRatos);
        System.out.printf("Total de sapos:  %d\n", totalSapos);

        System.out.printf("Percentual de coelhos:  %.2f\n", pCoelhos);
        System.out.printf("Percentual de ratos:  %.2f\n", pRatos);
        System.out.printf("Percentual de sapos:  %.2f\n", pSapos);

        sc.close();
    }
}