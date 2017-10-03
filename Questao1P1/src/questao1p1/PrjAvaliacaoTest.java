package questao1p1;

import java.util.Scanner;


public class PrjAvaliacaoTest {

    public int num = 0;
    public static final int NUMJOGADORES = 11;
    public static void main(String[] args) {
        // TODO code application logic here
        Jogador[] jog = new Jogador[NUMJOGADORES];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Jogador x = new Jogador();
            System.out.println("Id do Jogador: ");
            x.setIdJogador(Integer.parseInt(sc.nextLine()));
            System.out.println("Nome: ");
            x.setNomeJogador(sc.nextLine());
            System.out.println("Posicao: ");
            x.setPosicao(sc.nextLine());
            System.out.println("Num. da Camisa: ");
            x.setNumCamisa(Integer.parseInt(sc.nextLine()));
            jog[i] = x;
        }
        Time time  = new Time();
        System.out.println("Id do Time: ");
        time.setIdTime(Integer.parseInt(sc.nextLine()));
        System.out.println("Nome do Time ");
        time.setNomeTime(sc.nextLine());
        time.setJogador(jog);
        time.listarJogadores();
    }
    
}
