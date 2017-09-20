package revisaoexercicio1;

public class Funcionario {
    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private String dataContratacao;
    private double salario;
    private String documento;
    private boolean ativo;

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void atualizarSalario(double valor){
        if(valor>0){
            salario+= valor;
        }else{
            System.out.println("Valor deve ser"
                    + " positivo");
        }
    }
    public void demiteFuncionario(){
        ativo=false;
    }
    public String imprimir(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ");
        sb.append(idFunc).append("\n");
        sb.append("Nome: ");
        sb.append(nomeFunc).append("\n");
        sb.append("Departamento: ");
        sb.append(departamento).append("\n");
        sb.append("Data Contratacao: ");
        sb.append(dataContratacao).append("\n");
        sb.append("Salario: ");
        sb.append(salario).append("\n");
        sb.append("Documento: ");
        sb.append(documento).append("\n");
        if(isAtivo()){
            sb.append("Funcionario Ativo");
        }else{
            sb.append("Funcionario Desligado");
        }
        return sb.toString();
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
