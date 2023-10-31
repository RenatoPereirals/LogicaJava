import java.util.Scanner;

public class NumerosRomanos {

    public static void main(String[] args) {

        System.out.println("Digite um Número em Romanos, para saber qual é esse Número em Decimais");

        Scanner sc = new Scanner(System.in);

        String numeroRomanoInicial = sc.nextLine();

        String numeroRomano = numeroRomanoInicial.toUpperCase();

        System.out.println(verificarNumerosRomanos(numeroRomano));
    }

    public static int verificarNumerosRomanos(String numeroRomano) {
        int ans = 0, num = 0;
        for (int i = numeroRomano.length()-1; i >= 0; i--) {
            switch (numeroRomano.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return  ans;
    }
}

