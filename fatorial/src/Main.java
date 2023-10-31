import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, fatorial;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();

        fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        System.out.printf("FATORIAL = %d\n", fatorial);

        sc.close();
    }
}