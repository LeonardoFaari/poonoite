package questao1p1;


public class Time {
    private int idTime;
    private String nomeTime;
    private Jogador[] jogador;
    
    public void listarJogadores(){
        for(Jogador item : jogador){
            if(item!=null){
                System.out.println("ID: " + item.getIdJogador());
                System.out.println("Nome: " + item.getNomeJogador());
            }
        }
    }
    public Time(){
        jogador = new Jogador[11];
    }
    public Jogador[] getJogador(){
        return jogador;
    }
    public void setJogador(Jogador[] jogador){
        this.jogador = jogador;
    }
    public int getIdTime(){
        return idTime;
    }
    public void setIdTime(int idTime){
        this.idTime = idTime;
    }
    public String getNomeTime(){
        return nomeTime;
    }
    public void setNomeTime(String nomeTime){
        this.nomeTime = nomeTime;
    }
    
}
