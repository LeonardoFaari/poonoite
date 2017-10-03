package questao5_6;

import java.util.Scanner;

public class ComputadorTest {

    public static void main(String[] args) {
        Computador c1 = new Computador();
        Computador c2 = new Computador();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Computador x = new Computador();
            System.out.println("Id: ");
            x.setIdComputador(Integer.parseInt(sc.nextLine()));
            System.out.println("Nome: ");
            x.setNomeComputador(sc.nextLine());
            System.out.println("Qtd de Mem: ");
            x.setQtdMemoria(Integer.parseInt(sc.nextLine()));
            System.out.println("Valor: ");
            x.setValor(Double.parseDouble(sc.nextLine()));
            if (i == 0) {
                c1 = x;
            } else {
                c2 = x;
            }

        }
        Usuario u = new Usuario();
        u.setNivel(2);
        int ret = c1.atualizarPreco(1000, u);
        if (ret == 0) {
            System.out.println("Atualizou preco");
        } else {
            System.out.println("Não atualizou");
        }
        ret = c2.atualizarPreco(2000, u);
        if (ret == 0) {
            System.out.println("Atualizou preco");
        } else {
            System.out.println("Não atualizou");
        }
    }

}
