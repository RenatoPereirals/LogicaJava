import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float comprimento, largura, valorMetroquadrado, arae, preco;

        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextFloat();
        System.out.print("Digite o comprimento: ");
        comprimento = sc.nextFloat();
        System.out.print("Digite o valor do metro quadrado: ");
        valorMetroquadrado = sc.nextFloat();

        arae = largura * comprimento;
        preco = arae * valorMetroquadrado;

        System.out.printf("Area do terreno = %.2f\n", arae);
        System.out.printf("Valor do terreno = %.2f\n", preco);


        sc.close();
    }
}