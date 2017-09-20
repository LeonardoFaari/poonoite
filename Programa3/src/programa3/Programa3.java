package programa3;


public class Programa3 {


    public static void main(String[] args) {
        Casa c = new Casa();
        c.janela1.setCor("Azul");
        c.janela2.setCor("Azul");
        c.janela3.setCor("Azul");
        c.janela1.abre();
        c.janela2.fecha();
        c.janela3.abre();
        c.cor = "Amarelo";
        c.pinta("Verde");
        System.out.println("Qtd de janelas abertas: ");
        System.out.println(c.qtdJanelasAbertas());
        
        
    }
    
}
