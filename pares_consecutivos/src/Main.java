import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, somaPares;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        x = sc.nextInt();

        while (x != 0) {

            if (x % 2 == 0) {
                somaPares = 5 * x + 20;
            } else {
                somaPares = 5 * x + 25;
            }

            System.out.printf("SOMA = %d\n", somaPares);

            System.out.println("Digite um numero inteiro: ");
            x = sc.nextInt();
        }

        sc.close();
    }
}