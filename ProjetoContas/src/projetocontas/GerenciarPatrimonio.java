package projetocontas;


public class GerenciarPatrimonio {
    private double totalPatrimonio;

    public GerenciarPatrimonio() {
        totalPatrimonio = 0.0;
    }
    
    public void adicionarConta(Conta o){
        totalPatrimonio+= o.saldo;
    }
    
    public double getTotalPatrimonio(){
        return totalPatrimonio;
    }
    
    
}
