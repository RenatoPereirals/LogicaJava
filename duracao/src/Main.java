import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int duracao, hora, minuto, segundo;


        Scanner sc =new Scanner(System.in);

        System.out.print("Digite a duração em  segundos: ");
        duracao = sc.nextInt();

        hora = duracao / 3600;
        minuto = duracao % 3600 / 60;
        segundo = duracao % 3600 % 60;

        System.out.printf("%d:%d:%d", hora, minuto, segundo);

        sc.close();
    }
}