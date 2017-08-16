package projetoacampamentos;

import java.util.Scanner;

public class PrincipalAcampamento {


    public static void main(String[] args) {
        // Instanciar um membro
        Acampamento membro = new Acampamento();
        // Pedir os dados
        System.out.println("Digite o nome: ");
        // Classe scanner
        Scanner sc = new Scanner(System.in);
        membro.nome = sc.nextLine();
        System.out.println("Digite a idade: ");
        membro.idade = Integer.parseInt(sc.nextLine());
        //imprimir antes da logica de separacao
        membro.imprimir();
        membro.separarGrupo();
        //imprimir apos a logica de separacao
        membro.imprimir();
    }
    
}
