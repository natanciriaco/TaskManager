package app;

import controller.TaskManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskManager gerenciadorDeTarefas = new TaskManager();

        int opcaoEscolhida = 0;

        while (opcaoEscolhida != 5) {

            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1. Criar nova tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoEscolhida) {

                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String tituloTarefa = scanner.nextLine();

                    System.out.print("Digite a descrição da tarefa: ");
                    String descricaoTarefa = scanner.nextLine();

                    gerenciadorDeTarefas.adicionarTarefa(tituloTarefa, descricaoTarefa);
                    break;

                case 2:
                    gerenciadorDeTarefas.listarTarefas();
                    break;

                case 3:
                    System.out.print("Digite o número da tarefa que deseja concluir: ");
                    int indiceConclusao = scanner.nextInt();
                    gerenciadorDeTarefas.concluirTarefa(indiceConclusao - 1);
                    break;

                case 4:
                    System.out.print("Digite o número da tarefa que deseja remover: ");
                    int indiceRemocao = scanner.nextInt();
                    gerenciadorDeTarefas.removerTarefa(indiceRemocao - 1);
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}