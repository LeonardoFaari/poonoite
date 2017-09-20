package revisaoexercicio1;

import java.util.Scanner;


public class GerenciarFuncionario {


    public static void main(String[] args) {
     /*   Funcionario func = new Funcionario();
        func.setIdFunc(1);
        func.setNomeFunc("Juca Bala");
        func.setDataContratacao("12/12/1999");
        func.setDepartamento("Informatica");
        func.setSalario(12000.99);
        func.setDocumento("RG 123.123");
        func.setAtivo(true);
        //imprimir .   
        System.out.println(func.imprimir());
        func.demiteFuncionario();
        func.atualizarSalario(100.00);
        System.out.println(func.imprimir()); */
        
        //Exercicio final alterado
        Empresa emp = new Empresa();
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0; i< 3; i++){
            Funcionario f = new Funcionario();
            System.out.println("Digite o id: ");
            f.setIdFunc(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite o nome: ");
            f.setNomeFunc(sc.nextLine());
            emp.adicionaEmpregado(f, i);
            System.out.println("Funcionario incluido");
            
       }
        //Apresentar os empregados
        emp.mostraEmpregados();
        
        boolean t;
        Funcionario funcProc =  new Funcionario();
        System.out.println("Digite o id a ser procurado: ");
        funcProc.setIdFunc(Integer.parseInt(sc.nextLine()));
        t = emp.contemFuncionario(funcProc);
        if(t){
            System.out.println("Funcionario na empresa");
        }else{
            System.out.println("Funcionario nao pertence a empresa");
        }
    }
    
}
