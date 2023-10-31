import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idade, soma, cont;
        double  media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as idades:");
        idade = sc.nextInt();

        cont = 0;
        soma = 0;

        if (idade < 0) {
            System.out.println("Impossivel calcular");
        } else {
            while (idade >= 0) {
                soma = soma + idade;
                cont++;
                idade = sc.nextInt();
            }
            media =(double) soma/cont;
            System.out.printf("MEDIA = %.2f", media);
        }

        sc.close();
    }
}