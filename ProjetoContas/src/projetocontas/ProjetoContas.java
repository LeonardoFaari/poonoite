package projetocontas;

public class ProjetoContas {


    public static void main(String[] args) {
        
        Corrente c = new Corrente(222, 567, "Juca", 1000.0);
        c.depositar(2000.0);
        boolean r = c.sacar(2999);
        if(r){
            System.out.println("Saque efetuado");
        }else{
            System.out.println("Não possui saldo ou limite");
        }
        System.out.println(c.toString());
        Corrente c1 = new Corrente(333, 444, "Pedro", 2000.0);
        c1.depositar(10000.0);
        GerenciarPatrimonio gp =new GerenciarPatrimonio();
        gp.adicionarConta(c);
        gp.adicionarConta(c1);
        System.out.println("Total no Banco");
        System.out.println(gp.getTotalPatrimonio());
        
        
    }
    
}
