import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        float nota1, nota2, soma;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.print("Digite a sengunda nota: ");
        nota2 = sc.nextFloat();

        soma = nota1 + nota2;

        System.out.printf("NOTA FINAL = %.1f\n", soma);

        if (soma < 60){
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}