package projetocomputador2208;

public class Computador {
    //Atributos
    String marca;
    String cor;
    String modelo;
    long numeroSerie;
    double preco;
    
    //Métodos
    void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Num. Serie: " + numeroSerie);
        System.out.println("Preço: " + preco);
    }
    void calcularValor(){
        if(marca.equals("HP")){
            preco *= 1.3;
            return;
        }
        if(marca.equals("IBM")){
            preco *= 1.5;
        }
    }
    int alterarValor(double valor){
        if(valor < 0){
            return 0;
        }
        preco = valor;
        return 1;
    }
    
}
