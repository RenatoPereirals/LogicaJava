import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        System.out.println("Digite os numeros qu pretende somar");
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.print("A soma dos números é: ");
        System.out.println(NumeroSoma(numeros));



    }
    public static int NumeroSoma(int[] numeros) {
        int sum = 0;
        for (int numero : numeros) {
            sum += numero;
        }
           return sum;

    }
}