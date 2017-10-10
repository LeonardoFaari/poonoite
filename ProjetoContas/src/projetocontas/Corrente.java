package projetocontas;

public class Corrente extends Conta{
    private double limite;
    
    public Corrente(int agencia, int numero, 
            String nomeCliente, double limite) {
        super(agencia, numero, nomeCliente);
        this.limite = limite;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Limite.").append(limite).append("\n");
        return sb.toString();
    }
    @Override
    public boolean sacar(double valor){
        if(valor<=(saldo+limite)){
            saldo-=valor;
            return true;
        }
        return false;
    }
    
}
