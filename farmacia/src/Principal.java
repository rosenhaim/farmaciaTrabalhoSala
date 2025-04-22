
import java.util.ArrayList;
import java.util.List;


public class Principal {

    
    public static void main(String[] args) {
        
        
        Medicamento     m1,m2,m3;
        Funcionario     funcionario;
        funcionario     = new Gerente("Novo Gerente","14785");
      
        m1              = new Medicamento("Dipirona","genérico",5.00);
        m2              = new Medicamento("Buscopam","Eurofarma",15.00);
        m3              = new Medicamento("Resfenol","Hertz",20.19);     
        
        funcionario.adicionarItemEstoque(m1);
        funcionario.adicionarItemEstoque(m1);
        funcionario.adicionarItemEstoque(m1);
        
        Cliente             cliente;
        List<Medicamento>   carrinhoCompras;
        Venda               venda1, venda2,venda3;
        cliente             = new Cliente("Novo Cliente", "00145214789");
        carrinhoCompras     = new ArrayList<Medicamento>();
        venda1              = new Venda(cliente, carrinhoCompras);
        
        funcionario.efetuarVenda(venda1);
        System.out.println(funcionario.finalizarVenda());
        
     
        
        
        
        
         
       
        
        
        
        
        
        Gerente f1;
        f1 = new Gerente("Pato Donald", "007", 5000f);
        Caixa f2;
        f2 = new Caixa();
        f2.setNome("Tio Patinhas");
        f2.setMatricula("0007");
        f2.setSalario(3000f);
        
        
        
        Double valorFinal = m1.getValor() + m2.getValor() + m3.getValor();
        System.out.println("Valor a pagar sem desconto : " + valorFinal);
        
        System.out.println("Valor final com desconto Gerente:"
              + f1.aplicarDesconto(valorFinal,20.0));
        
        valorFinal = m1.getValor() + m2.getValor() + m3.aplicarDesconto(10.0);
        System.out.println("Valor a pagar com desconto "
                + "no resfenol: " + valorFinal);
        
      
       
    }
    
}
