package exemploentrada;

import java.util.Scanner;

public class ExemploEntrada {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Digite valor de a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite valor de b: ");
        b = sc.nextInt();
        int soma = a + b;
        System.out.println("Soma: " + soma);
        String letra;
        String nome;
        System.out.println("Digite uma letra");
        letra = sc.next();
        System.out.println("Digite um nome: ");
        nome = sc.next();
        System.out.println("Letra: " + letra);
        System.out.printf("Nome:   %s \n", nome);
    }
    
}
