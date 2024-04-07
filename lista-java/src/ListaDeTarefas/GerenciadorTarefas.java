package ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {
	private List<Tarefa> tarefa;
	
	//só para manter o encapsulamento
	GerenciadorTarefas(){
		tarefa = new ArrayList();
	}
	
	
	public void adicionarTarefa(Tarefa tarefa) {
		this.tarefa.add(tarefa);
	}
	
	public Boolean removerTarefa(String titulo) {
		for(int i = 0; i < tarefa.size(); i++){
			if(tarefa.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				tarefa.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public List<Tarefa> listarTarefas() {		
		return tarefa;
	}
}