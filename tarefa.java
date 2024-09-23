class Tarefa {
    String nome;
    String descricao;
    int prioridade;

    public Tarefa(String nome, String descricao, int prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Tarefa: " + nome + ", Descrição: " + descricao + ", Prioridade: " + prioridade;
    }
}