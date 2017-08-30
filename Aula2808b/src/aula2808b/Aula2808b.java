package aula2808b;

import java.util.Scanner;

public class Aula2808b {


    public static void main(String[] args) {
        String nomes[] = {"Joana" , "Josefa" };
       
        for (int i = 0; i < 2; i++) {
            System.out.println("Posicao " + i + " = " + nomes[i]);
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }
        String produtos[] = new String[5];
        Scanner sc = new Scanner(System.in);
        /* Não use for each para alimentar
        for (String produto : produtos) {
            System.out.println("Digite um produto: ");
            produto = sc.nextLine();
        }
                */
        //use sempre para percorrer
        for (String produto : produtos) {
            System.out.println(produto);
        }
    }
    
}
