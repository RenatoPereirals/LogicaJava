import acssecoUsuario.senha;
import acssecoUsuario.username;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String usuario, senha;

        Scanner sc = new Scanner(System.in);

        username adminUser = new username("adminUser");
        senha admimSenha = new senha("adminSenha");


        System.out.println("Digite o nome de usuário:");

        while (adminUser.isConduser() == false){
            usuario = sc.nextLine();
            adminUser.setUsuario(usuario);
            System.out.println(adminUser.getUsuario());
        }

        System.out.println("Digite a senha:");

        while (admimSenha.isCondSenha() == false){
            senha = sc.nextLine();
            admimSenha.setSenha(senha);
            System.out.println(admimSenha.getSenha());
        }
    }
}