import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade1, idade2;
        float media;
        String nome1, nome2;

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        nome1 = sc.nextLine();
        System.out.print("Idade: ");
        idade1 = sc.nextInt();

        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        sc.nextLine();
        nome2 = sc.nextLine();
        System.out.print("Idade: ");
        idade2 = sc.nextInt();

        media = (float)(idade1 + idade2) / 2;

        System.out.printf("A idade  media de %s e %s é %.1f\n", nome1, nome2, media);




    }
}