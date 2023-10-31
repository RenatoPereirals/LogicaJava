import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y, soma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros:");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            int troca = x;
            x = y;
            y = troca;
        }

        soma = 0;

        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }

        System.out.printf("SOMA DOS IMPARES = %d\n", soma);

        sc.close();
    }
}