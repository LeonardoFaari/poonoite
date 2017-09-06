package aula0509;

import java.util.Random;

public class Carro {
    //Atributos
    private int idCarro;
    private String marca;
    private String modelo;
    private int ano;
    
    //Métodos getters and setters
    public int getIdCarro(){
        return idCarro;
    }
    public void setIdCarro(int idCarro){
        this.idCarro = idCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    //Construtor personalizado
    public Carro(int idCarro, String marca,
            String modelo, int ano){
        this.idCarro = idCarro;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    //Segundo construtor
    public Carro(){
        Random r = new Random();
        this.idCarro = r.nextInt(10000) + 1;
        this.marca = "";
        this.modelo = "";
        this.ano = 1981;
    }
    @Override
    public String toString(){
        StringBuilder texto = new StringBuilder();
        texto.append("Id do Carro: ").append(idCarro).append("\n");
        texto.append("Marca: ").append(marca).append("\n");
        texto.append("Modelo: ").append(modelo).append("\n");
        texto.append("Ano: ").append(ano).append("\n");
        return texto.toString();
    }
}
