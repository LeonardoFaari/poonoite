package aula0509;

public class Aula0509 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idCarro = 1;
        String modelo = "Uno";
        String marca = "Fiat";
        int ano = 1999;
        Carro carro = new Carro(idCarro, marca, modelo, ano);
        System.out.println(carro.toString());
        
        System.out.println("");
        Carro carro2 = new Carro();
        
        carro2.setMarca("Fiat");
        carro2.setModelo("Palio");
        System.out.println(carro2.toString());
        
        Cliente cli = new Cliente();
        System.out.println(cli.toString());
        
        System.out.println("");
        
        Cliente cli2 = new Cliente(1355.99);
        System.out.println(cli2.toString());
        
    }
    
}
