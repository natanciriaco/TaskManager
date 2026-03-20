package controller;

import model.Tarefa;
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Tarefa> listaDeTarefas;

    public TaskManager() {
        listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String titulo, String descricao) {
        Tarefa novaTarefa = new Tarefa(titulo, descricao);
        listaDeTarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso.");
    }

    public void listarTarefas() {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (int indice = 0; indice < listaDeTarefas.size(); indice++) {
            Tarefa tarefaAtual = listaDeTarefas.get(indice);
            String status = tarefaAtual.isConcluida() ? "Concluída" : "Pendente";

            System.out.println((indice + 1) + ". " +
                    tarefaAtual.getTitulo() + " - " +
                    tarefaAtual.getDescricao() + " [" + status + "]");
        }
    }

    public void concluirTarefa(int indiceTarefa) {
        if (indiceTarefa >= 0 && indiceTarefa < listaDeTarefas.size()) {
            Tarefa tarefaSelecionada = listaDeTarefas.get(indiceTarefa);
            tarefaSelecionada.setConcluida(true);
            System.out.println("Tarefa marcada como concluída.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void removerTarefa(int indiceTarefa) {
        if (indiceTarefa >= 0 && indiceTarefa < listaDeTarefas.size()) {
            listaDeTarefas.remove(indiceTarefa);
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
