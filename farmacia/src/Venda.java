
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

 
public class Venda {
    private int                 vendaId;
    private List<Medicamento>   itensVendidos;

    public int getVendaId() {
        return vendaId;
    }

    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }

    public List<Medicamento> getItensVendidos() {
        return itensVendidos;
    }

    public void setItensVendidos(List<Medicamento> itensVendidos) {
        this.itensVendidos = itensVendidos;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    private double              valorTotal;
    private LocalDateTime       dataHora;
    private Funcionario         funcionario;
    private Cliente             cliente;

    public Venda(int vendaId, Funcionario funcionario, Cliente cliente) {
        this.vendaId        =           vendaId;
        this.funcionario    =           funcionario;
        this.cliente        =           cliente;
        this.itensVendidos  =           new ArrayList<>();
        this.dataHora       =           LocalDateTime.now();
    }

    /**
     * Construtor para iniciar a venda
     * @param cliente
     * @param carrinhoCompras 
     */
    public Venda(Cliente cliente, List<Medicamento> carrinhoCompras) {
        this.cliente            = cliente;
        this.itensVendidos     = new ArrayList<>();
        this.itensVendidos.addAll(itensVendidos);
    }

    public void adicionarItem(Medicamento medicamento) {
        itensVendidos.add(medicamento);
        calcularTotal();
    }

    public double calcularTotal() {
        valorTotal = 0;
        for (Medicamento item : itensVendidos) {
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }

    public void aplicarDesconto(double percentagem) {
        valorTotal -= valorTotal * (percentagem / 100);
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
