
public class Cliente {
    
    private String nome;
    private String codCliente;
    
    public Cliente(String nome, String codigo){
    this.nome = nome;
    this.codCliente = codigo;
    }
    public String getNome() {
        return nome;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

}
