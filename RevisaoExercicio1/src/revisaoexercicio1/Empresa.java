package revisaoexercicio1;

public class Empresa {
    public int idEmpresa;
    public String razaoSocial;
    public String cnpj;
    public Funcionario[] empregados;
    
    public Empresa(){
        empregados = new Funcionario[3];
    }
    public void adicionaEmpregado(Funcionario f, int posicao){
        if((posicao>=0) && (posicao < 3)){
            empregados[posicao] = f;
        }else{
            System.out.println("Nao ha espacos no vetor");
        }
    }
    public void mostraEmpregados(){
        for (Funcionario obj : empregados) {
            if(obj!=null){
                System.out.println(obj.imprimir());
            } 
            System.out.println("");
        }
    }
    public boolean contemFuncionario(Funcionario f){
        for (Funcionario obj : empregados) {
            if(obj!=null){
                if(f.getIdFunc()==obj.getIdFunc()){
                    return true;
                }
            }  
        }
        return false;
    }
}
