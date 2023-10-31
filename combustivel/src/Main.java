import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        char codigo;
        int contAlcool, contGasolina, contDisel;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        codigo = sc.next().charAt(0);

        contAlcool = 0;
        contGasolina = 0;
        contDisel = 0;

        while (codigo != '4') {
            switch (codigo) {
                case '1' -> contAlcool++;
                case '2' -> contGasolina++;
                case '3' -> contDisel++;
            }
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            codigo = sc.next().charAt(0);
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", contAlcool);
        System.out.printf("Gasolina: %d\n", contGasolina);
        System.out.printf("Disel: %d\n", contDisel);

        sc.close();
    }
}