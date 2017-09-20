/*
 * Aulas professor Maromo.
 */
package programa3;

import programa2.Janela;

/**
 *
 * @author maromo
 */
public class Casa {
    public Janela janela1;
    public Janela janela2;
    public Janela janela3;
    public String cor;
    
    //Construtor
    public Casa(){
        janela1 = new Janela();
        janela2 = new Janela();
        janela3 = new Janela();
    }
    public void pinta(String cor){
        this.cor = cor;
    }
    public int qtdJanelasAbertas(){
        int qtd=0;
        if(janela1.estaAberta())qtd++;
        if(janela2.estaAberta())qtd++;
        if(janela3.estaAberta())qtd++;
        return qtd;
    }
    
}
