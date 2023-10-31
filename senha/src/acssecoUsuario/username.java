package acssecoUsuario;

public class username {
//    Atributos
    private String usuario;
    private boolean conduser = false;
    private String mensagem;

//  Construtores


    public username(String usuario) {
        this.usuario = usuario;
    }

    //    Metodo
    public void setUsuario (String usuario){
        this.usuario = usuario;
    }
    public String getUsuario() {
       if (this.usuario.equalsIgnoreCase("admin")) {
            conduser = true;
            mensagem = "Sucesso";
        } else{
           conduser = false;
           mensagem = "Acesso negado. Tente novamente";
       }
        return this.mensagem;
    }
    public boolean isConduser() {
        return conduser;
    }


}
