import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores das coordenadas x e y:");
        x = sc.nextDouble();
        y = sc.nextDouble();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0){
                System.out.println("Q1");
            } else if (x < 0 && y > 0){
                System.out.println("Q2");
            } else if (x < 0 && y < 0){
                System.out.println("Q3");
            } else if (x > 0 && y < 0){
                System.out.println("Q4");
            }

            System.out.println("Digite os valores das coordenadas x e y:");
            x = sc.nextDouble();
            y = sc.nextDouble();
        }

        sc.close();
    }
}