package programa2;


public class Programa2 {


    public static void main(String[] args) {
        Janela j = new Janela();
        j.setDimensaoX(180);
        j.setDimensaoY(90);
        j.setDimensaoZ(5);
        j.pinta("Azul");
        j.pinta("Amarelo");
        j.fecha();
        System.out.println("Está aberta: ");
        if(j.estaAberta()){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
        System.out.println("Cor: " + j.getCor());
    }
    
}
