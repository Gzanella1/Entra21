import AtividadesTarefa.Checklistitem;
import AtividadesTarefa.Tarefa;

import javax.swing.event.ListDataEvent;
import javax.swing.text.TabableView;
import java.util.Scanner;

import AtividadesTarefa.ListaTarefas;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("informe a quantidade de tarefas da lista");
        ListaTarefas lt = new ListaTarefas(in.nextInt());
        in.nextLine();
        System.out.println("informe um nome para a lista de tarefas: ");
        lt.setNomeLista(in.nextLine());
        while (true) {
            Tarefa t = criarTarefa();
            if (!lt.adicionarTarefa(t)) {
                System.err.println("imposivel adicionar tarefa!");
                break;
            }
            System.out.println();
        }

    }

    public static Tarefa criarTarefa() {
        Tarefa t = new Tarefa();
        System.out.println(t.getUuid());
        System.out.println("Digite o nome da tarefa: ");
        t.setNome(in.nextLine());
        System.out.println("Digite a descrição da tarefa: ");
        t.setDescricao(in.nextLine());
        System.out.println("informe a ordem da tarefa:");
        t.setOrdem(in.nextInt());
        in.nextLine();
        System.out.println("Tarefa tem Checklist? (S/N)");
        String checklist = in.nextLine();
        if (checklist.equalsIgnoreCase("s")) {
            System.out.println("informe o tamanho do checklist");
            t.criarChecklist(in.nextInt());
            in.nextLine();
            while (true) {
                Checklistitem item = new Checklistitem();
                System.out.println("Item um nome para o item: ");
                item.setNome(in.nextLine());
                System.out.println("Informe uma descrição para o item: ");
                item.setDescricao(in.nextLine());
                t.adicionarChecklist(item);
                System.out.println("Deseja adicionar mais itens? (S/N)");
                String add = in.nextLine();
                if (add.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }
        return t;
    }


}



