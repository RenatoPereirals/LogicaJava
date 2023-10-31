import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite um Número em Romanos, para saber qual é esse Número em Decimais");

        Scanner sc = new Scanner(System.in);

        String romanToInt = sc.nextLine();

        String s = romanToInt.toUpperCase();

        System.out.println(romanToInt(s));
    }
    public static String romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch (s.charAt(i)) {
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

        String valor = String.valueOf(ans);

        System.out.print("O valor de ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.print(" em decimal é igual a ");
        if (s.length() > 15){
            return "Valor não pode ser calculado";
        } else {
            return valor+ ".";
        }
    }

}