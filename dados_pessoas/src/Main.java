import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, cont = 0;
        double maiorAltura, menorAltura, mediaMulheres, somaMulheres;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        char[] genero = new char[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        maiorAltura = altura[0];

        for (int i = 0; i < n; i++) {
            if (maiorAltura < altura[i]) {
                maiorAltura = altura[i];
            }
        }

        menorAltura = altura[0];

        for (int i = 0; i < n; i++) {
            if (menorAltura > altura[i]) {
                menorAltura = altura[i];
            }
        }

        somaMulheres = 0;

        for (int i = 0; i < n; i++) {
            if (genero[i] == 'F') {
                somaMulheres += altura[i];
                cont++;
            }
        }

        mediaMulheres = somaMulheres / cont;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
        System.out.printf("Numero de homens = %d\n", n - cont);

       sc.close();
    }
}