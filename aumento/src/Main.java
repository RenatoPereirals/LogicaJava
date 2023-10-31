import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double salario, novoSalario, aumento, porcentagem;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario sa pessoa: ");
        salario = sc.nextFloat();

        if (salario <= 1000) {
            novoSalario = salario * 1.20;
        } else if (salario <= 3000) {
            novoSalario = salario * 1.15;
        } else if (salario <= 8000) {
            novoSalario = salario * 1.10;
        } else {
            novoSalario = salario * 1.05;
        }
        aumento = novoSalario - salario;
        porcentagem = (aumento / salario) * 100;

        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
        System.out.printf("Aumento: R$%.2f\n", aumento);
        System.out.printf("Porcentagem: %.0f %%\n", porcentagem);

        sc.close();
    }
}