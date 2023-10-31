import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, produto;

        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor? ");
        n = sc.nextInt();

        for (int i = 1;i <=10; i++) {
            produto = n * i;
            System.out.printf("%d X %d = %d\n", n, i, produto);
        }

       sc.close();

    }
}