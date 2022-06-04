package AtividadesTarefa;

import java.util.UUID;

public class ListaTarefas {
    private int tamanhoLista;
    private String nomeLista;
    private Tarefa[] tarefas;

    public ListaTarefas(int tamanhoLista) {
    }

    public boolean adicionarTarefa(Tarefa tarefa) {
        return true;
    }

    public int buscarTarefa(int posicao) {
        return 1;
    }

    public int alterarOrdemTarefa(Tarefa tarefa, int novaposicao) {
        return 1;
    }


    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }
}
