package ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefas {
	/*
	 	Gerenciar uma lista de tarefas:
	
		Crie uma lista de tarefas com nome, descrição e status (pendente, concluído).
		Permita a adição de novas tarefas à lista.
		Permita a edição de tarefas existentes (nome, descrição, status).
		Permita a remoção de tarefas da lista.
		Imprima a lista de tarefas ordenada por status e nome.
	*/
	
	private Scanner sc;
	private List<String> nome;
	private List<String> descricao;
	private List<String> status;
	
	public ListaDeTarefas() {
        nome = new ArrayList<>();
        descricao = new ArrayList<>();
        status = new ArrayList<>();
        sc = new Scanner(System.in);
    }
	
	public void adicionandoNovasTarefas(String nome, String descricao, String status) {
		while(!status.equalsIgnoreCase("pendente") && !status.equalsIgnoreCase("concluido")) {
			System.out.println("O status só pode receber dois valores, 'Pendente' ou 'Concluido'");
			
			System.out.println("Informe o satus correto");
			status = sc.next();
		}
		this.nome.add(nome);
		this.descricao.add(descricao);
		this.status.add(status);
	}
	
	public void alterarTarefa(int indice) {
	    if (indice >= 0 && indice < status.size()) {
	        System.out.println("Alterar a tarefa " + nome.get(indice));
	        System.out.println("Deseja alterar o nome? Sim ou Não");
	        String confirmacao = sc.next();
	        sc.nextLine(); // Consumir a nova linha em branco
	        if (confirmacao.equalsIgnoreCase("sim")) {
	            System.out.println("Qual o nome?");
	            String novoNome = sc.nextLine();
	            nome.set(indice, novoNome);
	        }

	        System.out.println("Deseja alterar a descricao? Sim ou Nao");
	        confirmacao = sc.next();
	        sc.nextLine(); // Consumir a nova linha em branco
	        if (confirmacao.equalsIgnoreCase("Sim")) {
	            System.out.println("Qual a descricao?");
	            String novaDescricao = sc.nextLine();
	            descricao.set(indice, novaDescricao);
	        }

	        System.out.println("Deseja alterar o status? Sim ou Nao");
	        confirmacao = sc.next();
	        sc.nextLine(); // Consumir a nova linha em branco
	        if (confirmacao.equalsIgnoreCase("Sim")) {
	            System.out.println("Qual novo status? Concluido ou Pendente");
	            String novoStatus = sc.next();
	            status.set(indice, novoStatus);
	        }
	        System.out.println("Alteração concluida!");
	    }
	}
	
	public void removerTarefa(int indice) {
		if(indice >= 0 && indice <= status.size()) {
			nome.remove(indice);
			descricao.remove(indice);
			status.remove(indice);
			System.out.println("Tarefa removida com sucesso");
		}
		else {
			System.out.println("Indice inválido");
		}
	}
	
	public void listarTarefas() {
		System.out.println("Lista de tarefas");
		for(int i = 0; i < nome.size(); i++) {
			System.out.println("Nome: " + nome.get(i));
			System.out.println("Descrição: " + descricao.get(i));
			System.out.println("Status: " + status.get(i));
			System.out.println("");
		}
	}
}