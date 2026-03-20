package model;

public class TarefaPrioritaria extends Tarefa {

    private int prioridade;

    public TarefaPrioritaria(String titulo, String descricao, int prioridade) {
        super(titulo, descricao);
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
