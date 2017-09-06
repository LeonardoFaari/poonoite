package aula2908f;

public class Aula2908f {


    public static void main(String[] args) {
        Produto p1, p2, p3=null;
        p1 = new Produto();
        p1.id = 1;
        p1.nome = "Bola";
        p2 = new Produto();
        p2.id = 2;
        p2.nome = "Raquete";
        p3 = p2;
        //p3.imprimir();
        p3.id = 57;
        p3.nome = "Tamarino";
        p2.imprimir();
        p3.imprimir();
    }
    
}
