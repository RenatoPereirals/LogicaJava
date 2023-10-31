import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor?" );
        n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        System.out.println("Digite os valores de A: ");

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores de B: ");

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");

        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }

        sc.close();
    }
}