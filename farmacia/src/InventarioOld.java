
import java.util.HashMap;
import java.util.Map;


public class InventarioOld {
private Map<String, Medicamento> medicamentos;

    public InventarioOld() {
        medicamentos = new HashMap<>();
    }

    public void adicionarMedicamento(Medicamento medicamento) {
        medicamentos.put(medicamento.getNome(), medicamento);
    }

    public Medicamento getMedicamento(String nome) {
        return medicamentos.get(nome);
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        Medicamento medicamento = medicamentos.get(nome);
        if (medicamento != null) {
            medicamento.diminuirQuantidade(novaQuantidade);
        }
    }

    public void removerMedicamento(String nome) {
        medicamentos.remove(nome);
    }
}
