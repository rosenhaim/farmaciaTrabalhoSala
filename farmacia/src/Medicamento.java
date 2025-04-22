
import java.util.Date;


public class Medicamento implements Descontavel{
   private String nome;
    private int quantidade;
    private double preco;
    private Date dataValidade;
    private String id;
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Medicamento(String nome, int quantidade, double preco, Date dataValidade, String id) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.id = id;
    }

    Medicamento(String dipirona, String genérico, double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public String getId() {
        return id;
    }

    public void diminuirQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    public boolean estaExpirado() {
        return new Date().after(dataValidade);
    }

    @Override
    public Double aplicarDesconto(Double percentualDesconto) {
    Double valor = 0.0;
    return valor;
    }


}
