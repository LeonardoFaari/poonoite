package projetocontas;

public abstract class Conta {
    private int agencia;
    private int numero;
    private String nomeCliente;
    protected double saldo;
    
    public Conta(int agencia, int numero,
            String nomeCliente){
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Agencia: ").append(agencia).append("\n");
        sb.append("Numero: ").append(numero).append("\n");
        sb.append("Cliente: ").append(nomeCliente).append("\n");
        sb.append("Saldo: ").append(saldo).append("\n");
        return sb.toString();
    }
    public boolean sacar(double valor){
        if(valor<=saldo){
            saldo-=valor;
            return true;
        }
        return false;
    }
}
