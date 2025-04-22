
import java.awt.Button;
import java.util.List;
import javax.swing.JOptionPane;


public abstract class Funcionario {
    
   private String nome;
   private String matricula;
   private Float  salario;
   private Inventario inventario;

 public Funcionario(){
     this.inventario = new Inventario();
 }
           
           
public  boolean finalizarVenda() {
      
String formaPagamento = "";
formaPagamento = JOptionPane.showInputDialog("Qual a forma de pagamento?");
calculoFinal();
return true;
}

    private void calculoFinal() {
  
    
    }
    
    
    
    
    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
  
   
   
   
   public void setNome(String n){
       
       this.nome = n;
     
   }
   
   
   
   public void setMatricula(String mat){
       this.matricula = mat;
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public String getMatricula(){
       return this.matricula;
   }

    void efetuarVenda(Venda venda1) {
    //stream para mostra a prévia do valor final da compra
    List<Medicamento> itens = venda1.getItensVendidos();
        for (Medicamento item : itens) {
            System.out.println(item);
        }
    System.out.println();
    }
    
    public void adicionarItemEstoque(Medicamento m){
        inventario.adicionarMedicamento(m);
    }

    
   
}
