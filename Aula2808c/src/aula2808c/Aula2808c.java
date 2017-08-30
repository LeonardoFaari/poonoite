package aula2808c;

import java.util.Scanner;

public class Aula2808c {


    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[3];
        Aluno x = null;
        for (int i = 0; i < 3; i++) {
            x = new Aluno();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o ra: ");
            x.ra = Integer.parseInt(sc.nextLine());
            System.out.println("Digite o nome: ");
            x.nome = sc.nextLine();
            alunos[i] = x;
        }
        x.ra = 24;
        for (Aluno aluno : alunos) {
            aluno.matricular();
        }
    }
    
}
