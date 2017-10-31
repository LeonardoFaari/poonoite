package br.edu.fatecmm.sisacad.model;

public class Aluno {
    private int idAluno;
    private String nome;
    private String email;
    private String telefone;
    
    //Default vazio para os Strings
    public Aluno(){
        nome = "";
        email = "";
        telefone = "";
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
