package projetocontas;

public class Poupanca extends Conta {

    private int diaAniversario;
    
    public Poupanca(int agencia, int numero, 
            String nomeCliente, int diaAniversario) {
        super(agencia, numero, nomeCliente);
        this.diaAniversario = diaAniversario;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Dia Aniv.").append(diaAniversario).append("\n");
        return sb.toString();
    }
    
}
