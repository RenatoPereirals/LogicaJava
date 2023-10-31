import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, cont;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros va digitar? ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        cont = 0;

        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 ==0) {
                System.out.print(vet[i] + "  ");
                cont++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.printf("QUATIDADE DE PARES = %d", cont);


        sc.close();
    }
}