//Lara Geraseev
public class Pessoa {
    private String nome;
    private String email;
    private int fixo = 0;
    private int cel = 0;
    private String empresa; 
    private String tipo;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getFixo() {
        return fixo;
    }
    public void setFixo(int fixo) {
        this.fixo = fixo;
    }
    public int getCel() {
        return cel;
    }
    public void setCel(int cel) {
        this.cel = cel;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
