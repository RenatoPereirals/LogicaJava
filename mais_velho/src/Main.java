import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, maior;
        String nomeMaior = null;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        maior = idade[0];

        for (int i = 0; i < n; i++) {
            if (maior < idade[i]) {
                maior = idade[i];
                nomeMaior = nome[i];
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", nomeMaior);
        sc.close();
    }
}