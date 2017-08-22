package projetocontas2208;

import java.util.Scanner;


public class PrincipalContasCorrente {

    ContasCorrente cc = new ContasCorrente();
    
    public static void main(String[] args) {
        PrincipalContasCorrente pcc = new PrincipalContasCorrente();
        int opc=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Contas");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Consultar ");
            System.out.println("9.. Sair");
            System.out.println("Digite opcao: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    pcc.execCadastrar();
                    break;
                case 2:
                    pcc.execDeposito();
                    break;
                case 3:
                    pcc.execSaque();
                    break;
                case 4:
                    pcc.execConsulta();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opc!=9);
    }
    void execCadastrar(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Cadastrar uma conta");
        System.out.println("Digite o numero: ");
        cc.conta = sc.nextLine();
        System.out.println("Digite o nome: ");
        cc.nomeCliente = sc.nextLine();
        System.out.println("Cadastrado com sucesso...");
    }
    
    void execConsulta(){
        System.out.println("Mostrando a conta");
        cc.imprimir();
    }
    
    void execSaque(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Efetuando um saque");
        double valor;
        System.out.println("Digite um valor");
        valor = Double.parseDouble(sc.nextLine());
        int r = cc.sacar(valor);
        if(r==0){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Saque efetuado com sucesso");
        }
    }
    
    void execDeposito(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Efetuando um depósito");
        double valor;
        System.out.println("Digite um valor");
        valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito efetuado com sucesso");
    }
    
    
    
}
