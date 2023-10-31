package acssecoUsuario;

public class senha {

//    Atributos
    private String mensagem;
    private String senha;
    private boolean condSenha = false;

//    Construtores


    public senha(String senha) {
        this.senha = senha;
    }

    //    Metodo
    public void setSenha (String senha){
        this.senha = senha;
    }

    public String getSenha() {
        if (this.senha.equalsIgnoreCase("1234")) {
            condSenha = true;
            mensagem = "Sucesso";
        } else{
            condSenha = false;
            mensagem = "Acesso negado. Tente novamente";
        }
        return mensagem;
    }

    public boolean isCondSenha() {
        return condSenha;
    }
}
