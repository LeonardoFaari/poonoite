package programa1;

public class Programa1 {


    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Douglas esta na Fatec";
        p.idade = 33;
        p.fazAniversario();
        p.fazAniversario();
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
    }
    
}
