import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();

        if (x % 2 == 0) {
            for (int i = 0; i < x; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = 0; i <= x; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}