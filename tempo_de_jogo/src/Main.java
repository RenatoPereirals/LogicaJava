import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int horaInicial, horaFinal, duracao;

        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();

        if (horaInicial == horaFinal) {
            duracao = 24;
        } else if (horaInicial > horaFinal) {
            duracao = horaFinal - horaInicial + 24;
        } else {
            duracao = horaFinal - horaInicial;
        }

        System.out.printf("O JOGO DUROU %d HORA (S)",duracao);

    }
}