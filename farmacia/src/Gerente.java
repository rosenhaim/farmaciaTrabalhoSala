
public class Gerente extends Funcionario implements Descontavel{
    
    public Gerente(){
        
    }
    public Gerente (Float salario){
        
    }
    public Gerente(
                     String nome,
                     String matricula,
                     Float salario
                    ){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setSalario(salario);
    }
    
     public Gerente(
                     String nome,
                     String matricula
                     
                    ){
        this.setNome(nome);
        this.setMatricula(matricula);
        
    }
    
    public void cancelarCompra(){
        System.out.println("Compra cancelada");
    }

    @Override
    public String toString() {
        return "Nome" + this.getNome();
    }

    public Double aplicarDesconto(Double valorFinal, Double percentualDesconto){
        
        Double valorComDesconto = 0.0;
        return valorComDesconto;
    }
    
    @Override
    public Double aplicarDesconto(Double percentualDesconto) {
        double valor = 0;
        return valor;
    
    }

    
    
    
}
