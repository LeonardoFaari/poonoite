package aula0509b;

public class Esfera {
    private double raio;
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double calcularArea(){
        return 4 * Math.PI * Math.pow(raio, (double)2);
    }
}
