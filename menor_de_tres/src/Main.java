import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Segundo valor: ");
        b = sc.nextInt();
        System.out.print("Terceiro valor: ");
        c = sc.nextInt();

        if (a < b && a< c) {
            System.out.printf("Menor = %d\n", a);
        }else if (b < c) {
            System.out.printf("Menor = %d\n", b);
        }else {
            System.out.printf("Menor = %d\n", c);
        }
    }
}