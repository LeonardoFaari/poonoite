package projetoacampamentos;

public class Acampamento {
    String nome;
    char equipe;
    int idade;
    
    void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Equipe: " + equipe);
    }
    void separarGrupo(){
        if(idade < 6){
            equipe = '-';
        }else if(idade <=10){
            equipe = 'A';
        }else if(idade <=20){
            equipe = 'B';
        }else{
            equipe = 'C';
        }
    }
}
