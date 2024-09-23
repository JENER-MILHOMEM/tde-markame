import java.util.ArrayList;
import java.util.List;

public class Execute {
    private List<Tarefa> tarefas = new ArrayList<>();


    public void criarTarefa(String nome, String descricao, int prioridade) {
        Tarefa tarefa = new Tarefa(nome, descricao, prioridade);
        tarefas.add(tarefa);
        System.out.println("Tarefa criada: " + tarefa);
    }


    public void deletarTarefa(String nome) {
        tarefas.removeIf(t -> t.nome.equals(nome));
        System.out.println("Tarefa deletada: " + nome);
    }


    public void atualizarTarefa(String nome, String novaDescricao, int novaPrioridade) {
        for (Tarefa t : tarefas) {
            if (t.nome.equals(nome)) {
                t.descricao = novaDescricao;
                t.prioridade = novaPrioridade;
                System.out.println("Tarefa atualizada: " + t);
                return;
            }
        }
        System.out.println("Tarefa não encontrada: " + nome);
    }


    public void listarTarefas() {
        System.out.println("Lista de Tarefas:");
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
    }
    }


