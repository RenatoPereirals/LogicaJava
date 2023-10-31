import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float glicose;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        glicose = sc.nextFloat();


        if (glicose <= 100){
            System.out.println("Classificação: normal");
        } else if (glicose > 100 && glicose <= 140) {
            System.out.println("Classificação: elevado");
        }else {
            System.out.println("Classificação: diabetes");
        }

        sc.close();
    }
}