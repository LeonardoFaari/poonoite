package programa2;


public class Janela {
    private boolean aberta;
    private String cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;

    public boolean estaAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    public void pinta(String cor){
        this.cor = cor;
    }
    public void abre(){
        aberta = true;
    }
    public void fecha(){
        aberta = false;
    }
    
}
