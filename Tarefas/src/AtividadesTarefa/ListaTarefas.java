package AtividadesTarefa;

public class ListaTarefas {
    private int tamanhoLista;
    private String nomeLista;

    private Tarefa[] tarefas;

    public ListaTarefas(int tamanhoLista) {
        this.setTamanhoLista(tamanhoLista);
        this.setTarefas(new Tarefa[tamanhoLista]);
    }

    //add uma tarefa na lista percorrendo tod o o array
    public boolean adicionarTarefa(Tarefa tarefa) {
        if (tarefa.getOrdem() < 0 || tarefa.getOrdem() >= this.getTamanhoLista()) {
            return false;
        }
        //primeira inteirção do for checa se é nulo
        for (int i = 0; i < this.getTamanhoLista(); i++) {
            if (this.getTarefas()[i] == null) {
                this.getTarefas()[i] = tarefa;
                return true;
            } else if (this.getTarefas()[i].getOrdem() == tarefa.getOrdem()) {
                break;
            }
        }
        return false;
    }


    public Tarefa buscarTarefa(int posicao) {
        for (Tarefa t : this.getTarefas()) {
            if (t != null && t.getOrdem() == posicao) {
                return t;
            }
        }
        return null;
    }


    public boolean alterarOrdemTarefa(int antigaordem, int novaOrdem) {
        Tarefa tarefaAntiga = buscarTarefa(antigaordem);
        Tarefa novaTarefa = buscarTarefa(novaOrdem);

        if (buscarTarefa(antigaordem) == null || buscarTarefa(novaOrdem) == null) {
            return false;
        }
        tarefaAntiga.setOrdem(novaOrdem);
        novaTarefa.setOrdem(antigaordem);

        return false;
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

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}
