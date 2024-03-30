package ListaDeTarefas;

public class Main {
	public static void main(String[] args) {
		ListaDeTarefas tarefa = new ListaDeTarefas();
		
		tarefa.adicionandoNovasTarefas("Visitar meus amigos", "Ir na quarta visitar meus amigos em boa viagem", "pendente");
		tarefa.adicionandoNovasTarefas("Passear", "fazer algo de bom", "concluido");
		tarefa.adicionandoNovasTarefas("Ir no cinema", "No domingo ir no cinema com alguem", "pendente");

		tarefa.listarTarefas();
		
	}
}
