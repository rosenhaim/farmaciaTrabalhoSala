
import java.util.ArrayList;
import java.util.List;


/**
 * Classe para simular o banco de dados da Farmacia
 * @author rosenhaim
 */
public class Inventario {
    List<Medicamento> listaMedicamentos;
    
    
    public Inventario(){
        listaMedicamentos = new ArrayList<Medicamento>();
    }
    
    public void adicionarMedicamento(Medicamento m){
        this.listaMedicamentos.add(m);
    }
    public void removerItens(List<Medicamento> carrinhoCompra){
        
        for (Medicamento medicamentoCarrinho : carrinhoCompra) {
            
            for (Medicamento medicamentoEstoque : carrinhoCompra) {
                if (medicamentoCarrinho.getNome()
                        .equalsIgnoreCase(medicamentoEstoque.getNome())){
                    this.listaMedicamentos.remove(medicamentoEstoque);
                }
            }
            
        }
        
    }
    
}
