import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, contDentro, contFora;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        contDentro = 0;
        contFora = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Digite um numero: ");
            int x = sc.nextInt();

            if (x < 10 || x > 20) {
                contFora++;
            } else {
                contDentro++;
            }
        }

        System.out.println(contDentro + " Dentro");
        System.out.println(contFora + " Fora");

        sc.close();
    }
}