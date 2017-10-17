package controlecaixa;

public class Caixa {
    private double valor;
    private double saldo;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo-= valor;
            return true;
        }
        return false;
    }
    public boolean depositar(double valor){
        if(valor >= 0){
            saldo+= valor;
            return true;
        }
        return false;
    }
    
    
}
