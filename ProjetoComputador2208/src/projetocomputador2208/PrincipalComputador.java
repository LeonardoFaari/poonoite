package projetocomputador2208;

public class PrincipalComputador {


    public static void main(String[] args) {
        // TODO code application logic here
        Computador c1 = new Computador();
        c1.marca = "HP";
        c1.cor = "Azul";
        c1.modelo = "Pavilon";
        c1.numeroSerie = 123;
        c1.preco = 2000;
        c1.imprimir();
        c1.calcularValor();
        c1.imprimir();
        
        Computador c2 = new Computador();
        c2.marca = "IBM";
        c2.cor = "Prata";
        c2.modelo = "Lenovo";
        c2.numeroSerie = 234;
        c2.preco = 3000;
        c2.imprimir();
        c2.calcularValor();
        c2.imprimir();
        
        int r = c2.alterarValor(-5000);
        if(r==1){
            System.out.println("Preco Alterado");
            c2.imprimir();
        }else{
            System.out.println("Preco nao pode ser neg");
        }
    }
    
}
