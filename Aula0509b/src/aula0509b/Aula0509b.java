package aula0509b;

import java.util.Scanner;



public class Aula0509b {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = Double.parseDouble(sc.nextLine());
        Esfera esf = new Esfera();
        esf.setRaio(raio);
        System.out.println("Àrea é: " + esf.calcularArea());
    }
    
}
