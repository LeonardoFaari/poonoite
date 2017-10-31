package br.edu.fatecmm.sisacad.business;

import br.edu.fatecmm.sisacad.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoBus {
    private List<Aluno> lista;
    
    public AlunoBus(){
        lista = new ArrayList<>();
    }

    public List<Aluno> getLista() {
        return lista;
    }
    
    public void adicionarAlunoLista(Aluno aluno){
        this.lista.add(aluno);
    }
}
