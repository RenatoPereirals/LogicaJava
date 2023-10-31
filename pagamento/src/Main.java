import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        float valorHora, salario;
        int hora;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Valor por hora: ");
        valorHora = sc.nextFloat();
        System.out.print("Horas trabalhadas: ");
        hora = sc.nextInt();

        salario = valorHora * hora;

        System.out.printf("O pagamento para %s deve ser %.2f", nome, salario);

    sc.close();
    }
}