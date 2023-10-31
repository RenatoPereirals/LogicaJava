import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("Crescente!");
            } else {
                System.out.println("Decrecenste");
            }
            System.out.println("Digite outros dois números:");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}