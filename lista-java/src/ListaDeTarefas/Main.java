package ListaDeTarefas;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Data data = new Data(21, 11, 2024);
		//primeira tarefa
		Tarefa tarefa1 = new Tarefa("meia noite", "era uma vez", data);	

		GerenciadorTarefas gerenciador = new GerenciadorTarefas();
		
		gerenciador.adicionarTarefa(tarefa1);
		
		//adicionando segunda tarefa
		Tarefa tarefa2 = new Tarefa("Ir ao cinema", "Tenho que ir ao cinema às 15h", new Data(07,04,2024));
		gerenciador.adicionarTarefa(tarefa2);
		
		
		//lista tarefa vai amarzenar o metodo de listar as tarefas
        List<Tarefa> listaDeTarefas = gerenciador.listarTarefas();
        
        
        for (Tarefa listarTarefa : listaDeTarefas) {
        	System.out.println();
            System.out.println("Título: " + listarTarefa.getTitulo()); 
            System.out.println("Descrição: " + listarTarefa.getDescricao());
            System.out.println("Vencimento "
        + listarTarefa.getVencimento().getDia() + "/" + listarTarefa.getVencimento().getMes() + "/" + listarTarefa.getVencimento().getAno());
            
        }
		
		

		
		
		
	
		
	}
}
