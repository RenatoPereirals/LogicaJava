import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros interos: ");
        x =sc.nextInt();
        y =sc.nextInt();

        if (x < y) {
            int troca = x;
            x = y;
            y = troca;
        }
        if (x % y == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}