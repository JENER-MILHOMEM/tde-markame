import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Execute exec = new Execute();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Criar tarefa");
            System.out.println("2 - Exibir tarefas");
            System.out.println("3 - Deletar tarefa");
            System.out.println("4 - Atualizar tarefa");
            System.out.println("5 - Sair");

            System.out.print("Digite a opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = sc.nextLine();

                    System.out.print("Digite a prioridade da tarefa (número): ");
                    int prioridade = sc.nextInt();

                    exec.criarTarefa(nome, descricao, prioridade);
                    break;

                case 2:
                    exec.listarTarefas();
                    break;

                case 3:
                    System.out.print("Digite o nome da tarefa que deseja deletar: ");
                    String nome2 = sc.nextLine();
                    exec.deletarTarefa(nome2);
                    break;

                case 4:
                    System.out.print("Digite o nome da tarefa que deseja atualizar: ");
                    String nome3 = sc.nextLine();

                    System.out.print("Digite a nova descrição da tarefa: ");
                    String novaDescricao = sc.nextLine();

                    System.out.print("Digite a nova prioridade da tarefa (número): ");
                    int novaPrioridade = sc.nextInt();

                    exec.atualizarTarefa(nome3, novaDescricao, novaPrioridade);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

